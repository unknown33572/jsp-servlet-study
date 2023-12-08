package com.study.dao;

import com.study.dto.UserVO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
  private UserDAO() {

  }

  private static final UserDAO instance = new UserDAO(); // Singleton

  public static UserDAO getInstance() {
    return instance;
  }

  public Connection getConnection() throws Exception { // DB Connection Pool
    Connection conn = null;
    Context initContext = new InitialContext();
    Context envContext = (Context)initContext.lookup("java:/comp/env");
    DataSource ds = (DataSource)envContext.lookup("jdbc/test");
    conn = ds.getConnection();
    return conn;
  }

  public int userCheck(String uid, String upw) {
    int result = -1;
    String sql = "select pwd from users where userid = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uid);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        if(rs.getString("pwd") != null && rs.getString("pwd").equals(upw)) {
          result = 1;
        } else {
          result = 0;
        }
      } else {
        result = -1;
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return result;
  }

  public UserVO getUser(String uid) {
    UserVO uVo = null;
    String sql = "select * from users where userid = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uid);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        uVo = new UserVO();
        uVo.setUid(rs.getString("userid"));
        uVo.setUpw(rs.getString("pwd"));
        uVo.setUname(rs.getString("name"));
        uVo.setEmail(rs.getString("email"));
        uVo.setPhone(rs.getString("phone"));
        uVo.setGender(rs.getString("gender"));
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return uVo;
  }

  public int comfirmID(String userid) {
    int result = 0;
    String sql = "select userid from users where userid = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, userid);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        result = 1;
      } else {
        result = -1;
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return result;
  }

  public int insertUser(UserVO uVo) {
    int result = -1;
    String sql = "insert into users (userid, pwd, name, email, phone, gender) values(?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uVo.getUid());
      pstmt.setString(2, uVo.getUpw());
      pstmt.setString(3, uVo.getUname());
      pstmt.setString(4, uVo.getEmail());
      pstmt.setString(5, uVo.getPhone());
      pstmt.setString(6, uVo.getGender());
      result = pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return result;
  }

  public int updateUser(UserVO uVo) {
    int result = -1;
    String sql = "update users set email=?," + "phone=? where userid=?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uVo.getEmail());
      pstmt.setString(2, uVo.getPhone());
      pstmt.setString(3, uVo.getUid());
      result = pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    return result;
  }
}
