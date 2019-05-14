package com.inxedu.os.edu.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录日志
 * @author www.inxedu.com
 */
@Data
public class UserLoginLog implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int logId;//ID
	private Date loginTime;//登录时间
	private String ip;//登录IP
	/**
	 * @return the logId
	 */
	public int getLogId() {
		return logId;
	}
	/**
	 * @param logId the logId to set
	 */
	public void setLogId(int logId) {
		this.logId = logId;
	}
	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the osName
	 */
	public String getOsName() {
		return osName;
	}
	/**
	 * @param osName the osName to set
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}
	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}
	/**
	 * @param userAgent the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int userId;//用户ID
	private String osName;//操作系统
	private String userAgent;//浏览器

}
