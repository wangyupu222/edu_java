package com.inxedu.os.edu.entity.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 外部登录用户信息
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebLoginUser implements Serializable{

   private static final long serialVersionUID = -4181611215034299276L;

   private Long id;// 主键 id
   private Long cusId;// 用户id
   private String email = "";// 邮件
   private String mobile = "";// 手机号
   private String nickname = "";// 用户名
   /**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the cusId
 */
public Long getCusId() {
	return cusId;
}
/**
 * @param cusId the cusId to set
 */
public void setCusId(Long cusId) {
	this.cusId = cusId;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the mobile
 */
public String getMobile() {
	return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(String mobile) {
	this.mobile = mobile;
}
/**
 * @return the nickname
 */
public String getNickname() {
	return nickname;
}
/**
 * @param nickname the nickname to set
 */
public void setNickname(String nickname) {
	this.nickname = nickname;
}
/**
 * @return the realname
 */
public String getRealname() {
	return realname;
}
/**
 * @param realname the realname to set
 */
public void setRealname(String realname) {
	this.realname = realname;
}
/**
 * @return the gender
 */
public int getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(int gender) {
	this.gender = gender;
}
/**
 * @return the avatar
 */
public String getAvatar() {
	return avatar;
}
/**
 * @param avatar the avatar to set
 */
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
/**
 * @return the userInfo
 */
public String getUserInfo() {
	return userInfo;
}
/**
 * @param userInfo the userInfo to set
 */
public void setUserInfo(String userInfo) {
	this.userInfo = userInfo;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}
private String realname;// 真实姓名
   private int gender=0;// 性别：0男 1女
   private String avatar;// 头像地址
   private String userInfo="";// 用户简介
}
