package com.inxedu.os.edu.entity.questions;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
/**
 * 问答评论
 *@author www.inxedu.com
 */
@Data
public class QuestionsComment implements Serializable {
	private static final long serialVersionUID = 7687324559966427231L;
    private Long id;// 主键自增
    private Long cusId;// 评论人id
    private Long questionId;// 问答id
    private String content;// 内容
    private int isBest;// 是否为最佳答案 0否1是
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
	 * @return the questionId
	 */
	public Long getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the isBest
	 */
	public int getIsBest() {
		return isBest;
	}
	/**
	 * @param isBest the isBest to set
	 */
	public void setIsBest(int isBest) {
		this.isBest = isBest;
	}
	/**
	 * @return the replyCount
	 */
	public int getReplyCount() {
		return replyCount;
	}
	/**
	 * @param replyCount the replyCount to set
	 */
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	/**
	 * @return the praiseCount
	 */
	public int getPraiseCount() {
		return praiseCount;
	}
	/**
	 * @param praiseCount the praiseCount to set
	 */
	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * @return the commentId
	 */
	public Long getCommentId() {
		return commentId;
	}
	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	/**
	 * @return the limitSize
	 */
	public int getLimitSize() {
		return limitSize;
	}
	/**
	 * @param limitSize the limitSize to set
	 */
	public void setLimitSize(int limitSize) {
		this.limitSize = limitSize;
	}
	/**
	 * @return the orderFlag
	 */
	public String getOrderFlag() {
		return orderFlag;
	}
	/**
	 * @param orderFlag the orderFlag to set
	 */
	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}
	/**
	 * @return the showName
	 */
	public String getShowName() {
		return showName;
	}
	/**
	 * @param showName the showName to set
	 */
	public void setShowName(String showName) {
		this.showName = showName;
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
	 * @return the picImg
	 */
	public String getPicImg() {
		return picImg;
	}
	/**
	 * @param picImg the picImg to set
	 */
	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}
	/**
	 * @return the questionsCommentList
	 */
	public List<QuestionsComment> getQuestionsCommentList() {
		return questionsCommentList;
	}
	/**
	 * @param questionsCommentList the questionsCommentList to set
	 */
	public void setQuestionsCommentList(List<QuestionsComment> questionsCommentList) {
		this.questionsCommentList = questionsCommentList;
	}
	/**
	 * @return the questionsTitle
	 */
	public String getQuestionsTitle() {
		return questionsTitle;
	}
	/**
	 * @param questionsTitle the questionsTitle to set
	 */
	public void setQuestionsTitle(String questionsTitle) {
		this.questionsTitle = questionsTitle;
	}
	/**
	 * @return the questionsStatus
	 */
	public int getQuestionsStatus() {
		return questionsStatus;
	}
	/**
	 * @param questionsStatus the questionsStatus to set
	 */
	public void setQuestionsStatus(int questionsStatus) {
		this.questionsStatus = questionsStatus;
	}
	/**
	 * @return the beginCreateTime
	 */
	public Date getBeginCreateTime() {
		return beginCreateTime;
	}
	/**
	 * @param beginCreateTime the beginCreateTime to set
	 */
	public void setBeginCreateTime(Date beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
	}
	/**
	 * @return the endCreateTime
	 */
	public Date getEndCreateTime() {
		return endCreateTime;
	}
	/**
	 * @param endCreateTime the endCreateTime to set
	 */
	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int replyCount;// 回复数量
    private int praiseCount;// 点赞数
    private Date addTime;// 添加时间
    private Long commentId;//父级评论id
    
    private int limitSize;//查询限制条数
    private String orderFlag;//排序值 new 最新
    private String showName;//用户名
    private String email;//用户邮箱
    private String picImg;//用户头像
    private List<QuestionsComment> questionsCommentList;//子评论列表
    private String questionsTitle;//问答标题
    private int questionsStatus;//问答状态  0可回复1不可回复（采纳最佳答案后改为1 ）
    private Date beginCreateTime;//查询 开始添加时间
    private Date endCreateTime;//查询 结束添加时间
}
