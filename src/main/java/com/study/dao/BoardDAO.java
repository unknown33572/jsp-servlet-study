package com.study.dao;

import com.study.dto.BoardVO;
import com.study.util.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
  private BoardDAO() {

  }

  private static final BoardDAO instance = new BoardDAO();

  public static BoardDAO getInstance() {
    return instance;
  }

  public List<BoardVO> selectAllBoards() {
    String sql = "select * from board order by num desc"; // 최신글이 위로 와야함

    List<BoardVO> list = new ArrayList<BoardVO>(); // <> 제네릭 사용해서 정적타입
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection(); // util package에 만들어놓은 DBManager 클래스의 getConnection() 메소드를 사용해서 DB와 연결
      stmt = conn.createStatement(); // Statement 객체 생성
      rs = stmt.executeQuery(sql); // 쿼리 실행

      while(rs.next()) {
        BoardVO bVo = new BoardVO(); // BoardVO 객체 생성
        bVo.setNum(rs.getInt("num"));
        bVo.setName(rs.getString("name"));
        bVo.setEmail(rs.getString("email"));
        bVo.setPass(rs.getString("pass"));
        bVo.setTitle(rs.getString("title"));
        bVo.setContent(rs.getString("content"));
        bVo.setViewcount(rs.getInt("viewcount"));
        bVo.setWritedate(rs.getTimestamp("writedate"));
        list.add(bVo); // list에 BoardVO 객체 추가
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, stmt, rs); // util package에 만들어놓은 DBManager 클래스의 close() 메소드를 사용해서 DB와 연결 종료
    }
    return list;
  }

  public void insertBoard(BoardVO bVo) {
    String sql = "insert into board(name, pass, title, content) values(?, ?, ?, ?)";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, bVo.getName());
      pstmt.setString(2, bVo.getPass());
      pstmt.setString(3, bVo.getTitle());
      pstmt.setString(4, bVo.getContent());

      pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt); // 오버로딩된 close() 메소드 사용
    }
  }

  public void updateViewCount(String num) {
    String sql = "update board set viewcount = viewcount + 1 where num = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);

      pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }

  public BoardVO selectOneBoardByNum(String num) {
    String sql = "select * from board where num = ?";

    BoardVO bVo = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, num);
      rs = pstmt.executeQuery();

      if(rs.next()) {
        bVo = new BoardVO();
        bVo.setNum(rs.getInt("num"));
        bVo.setName(rs.getString("name"));
        bVo.setEmail(rs.getString("email"));
        bVo.setPass(rs.getString("pass"));
        bVo.setTitle(rs.getString("title"));
        bVo.setContent(rs.getString("content"));
        bVo.setViewcount(rs.getInt("viewcount"));
        bVo.setWritedate(rs.getTimestamp("writedate"));
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt, rs);
    }
    return bVo; // 반환
  }

  public void updateBoard(BoardVO bVo) {
    String sql = "update board set name = ?, email = ?, pass = ?, title = ?, content = ? where num = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, bVo.getName());
      pstmt.setString(2, bVo.getEmail());
      pstmt.setString(3, bVo.getPass());
      pstmt.setString(4, bVo.getTitle());
      pstmt.setString(5, bVo.getContent());
      pstmt.setInt(6, bVo.getNum());

      pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }

  public BoardVO checkPassword(String pass, String num) {
    String sql = "select * from board where pass = ? and num = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null; // select문은 ResultSet 사용
    BoardVO bVo = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, pass);
      pstmt.setString(2, num);

      rs = pstmt.executeQuery();

      if(rs.next()) {
        bVo = new BoardVO();
        bVo.setNum(rs.getInt("num"));
        bVo.setName(rs.getString("name"));
        bVo.setEmail(rs.getString("email"));
        bVo.setPass(rs.getString("pass"));
        bVo.setTitle(rs.getString("title"));
        bVo.setContent(rs.getString("content"));
        bVo.setViewcount(rs.getInt("viewcount"));
        bVo.setWritedate(rs.getTimestamp("writedate"));
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt, rs);
    }
    return bVo;
  }

  public void deleteBoard(String num) {
    String sql = "delete from board where num = ?";

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);

      pstmt.setString(1, num);

      pstmt.executeUpdate();
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }
}
