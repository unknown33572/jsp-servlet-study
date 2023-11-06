package com.study.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
  private int num;
  private String name;
  private String email;
  private String pass;
  private String title;
  private String content;
  private int viewcount;
  private String writedate;

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getViewcount() {
    return viewcount;
  }

  public void setViewcount(int viewcount) {
    this.viewcount = viewcount;
  }

  public String getWritedate() {
    return writedate;
  }

  public void setWritedate(Timestamp writedate) {
    this.writedate = new SimpleDateFormat("yyyy-MM-dd").format(writedate);
  }
}
