package com.inxedu.os.edu.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 学员
 * @author www.inxedu.com
 */
@Data
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	/**学员ID*/
	private int userId;
	/**手机号*/
	private String mobile;
	/**邮箱*/
	private String email;
	/**密码*/
	private String password;
	/**学员名*/
	private String userName;
	/**显示名（昵称）*/
	private String showName;
	/**性别 1男	2女*/
	private int sex;
	/**年龄*/
	private int age;
	/**注册时间*/
	private Date createTime;
	/**状态 1正常	2冻结*/
	private int isavalible;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getIsavalible() {
		return isavalible;
	}

	public void setIsavalible(int isavalible) {
		this.isavalible = isavalible;
	}

	public String getPicImg() {
		return picImg;
	}

	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public int getMsgNum() {
		return msgNum;
	}

	public void setMsgNum(int msgNum) {
		this.msgNum = msgNum;
	}

	public int getSysMsgNum() {
		return sysMsgNum;
	}

	public void setSysMsgNum(int sysMsgNum) {
		this.sysMsgNum = sysMsgNum;
	}

	public Date getLastSystemTime() {
		return lastSystemTime;
	}

	public void setLastSystemTime(Date lastSystemTime) {
		this.lastSystemTime = lastSystemTime;
	}

	public long getLoginTimeStamp() {
		return loginTimeStamp;
	}

	public void setLoginTimeStamp(long loginTimeStamp) {
		this.loginTimeStamp = loginTimeStamp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**用户头像*/
	private String picImg;
	/**个人中心个性图片URL*/
	private String bannerUrl;
	/** 站内信未读消息数*/
	private int msgNum;
	/**系统自动消息未读消息数*/
	private int sysMsgNum;
    /**上传统计系统消息时间*/
    private Date lastSystemTime;

	private long loginTimeStamp;//登录时的当前时间戳
}
