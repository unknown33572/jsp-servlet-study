package com.study.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
  public static Connection getConnection() {
    Connection conn = null;
    try {
      Context initContext = new InitialContext();
      Context envContext = (Context) initContext.lookup("java:/comp/env");
      DataSource ds = (DataSource) envContext.lookup("jdbc/test");
      conn = ds.getConnection();
    } catch(Exception e) {
        e.printStackTrace();
    }
    return conn;
  }

  public static void close(Connection conn, Statement stmt, ResultSet rs) {
    try {
      stmt.close();
      conn.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void close(Connection conn, PreparedStatement pstmt) { // 오버로딩
    try {
      pstmt.close();
      conn.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
