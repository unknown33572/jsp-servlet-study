package com.study.dto;

public class UserVO {
  private String uid;
  private String pwd;
  private String uname;
  private String email;
  private String phone;
  private String gender;

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getUpw() {
    return pwd;
  }

  public void setUpw(String pwd) {
    this.pwd = pwd;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "UserVO{" +
        "uid='" + uid + '\'' +
        ", upw='" + pwd + '\'' +
        ", uname='" + uname + '\'' +
        ", email='" + email + '\'' +
        ", phone='" + phone + '\'' +
        ", gender='" + gender + '\'' +
        '}';
  }
}
