package com.inxedu.os.edu.entity.common;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * @author www.inxedu.com
 *
 */
@Data
public class Comment {
	private int commentId;//评论Id
	private int userId;//用户id
	private int pCommentId;//父级评论id // 为0 则是一级评论 不为0则是评论的回复
	private String content;//评论内容
	private Date addTime;//发送时间
	private int otherId;//相关Id
	private int praiseCount;//点赞数
	public int getCommentId() {
		return commentId;
	}
	/**
	 * @return the pCommentId
	 */

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	/**
	 * @return the pCommentId
	 */
	public int getpCommentId() {
		return pCommentId;
	}
	/**
	 * @param pCommentId the pCommentId to set
	 */
	public void setpCommentId(int pCommentId) {
		this.pCommentId = pCommentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getOtherId() {
		return otherId;
	}
	public void setOtherId(int otherId) {
		this.otherId = otherId;
	}
	public int getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getPicImg() {
		return picImg;
	}
	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}
	public int getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	public int getLimitNumber() {
		return limitNumber;
	}
	public void setLimitNumber(int limitNumber) {
		this.limitNumber = limitNumber;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Date getBeginCreateTime() {
		return beginCreateTime;
	}
	public void setBeginCreateTime(Date beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
	}
	public Date getEndCreateTime() {
		return endCreateTime;
	}
	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}
	private int replyCount;//回复数
	private int type;//类型 1 文章 2 课程

	private String email;//用户Email
	private String userName;//用户昵称
	private String courseName;//课程名
	private int courseId;//课程id
	private String picImg;//用户头像
	private int commentNumber;//回复数
	private int limitNumber;//查询数
	private String order ="commentId";// commentId 降序  praiseCount 降序
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date beginCreateTime;//查询 开始时间
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endCreateTime;//查询 结束时间
}
