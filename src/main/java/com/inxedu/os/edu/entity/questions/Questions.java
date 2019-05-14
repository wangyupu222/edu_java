package com.inxedu.os.edu.entity.questions;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.inxedu.os.common.util.DateUtils;

import lombok.Data;

/**
 * 问答
 * @author www.inxedu.com
 */
@Data
public class Questions implements Serializable {
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
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
	 * @return the browseCount
	 */
	public int getBrowseCount() {
		return browseCount;
	}

	/**
	 * @param browseCount the browseCount to set
	 */
	public void setBrowseCount(int browseCount) {
		this.browseCount = browseCount;
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
	 * @return the orderFalg
	 */
	public String getOrderFalg() {
		return orderFalg;
	}

	/**
	 * @param orderFalg the orderFalg to set
	 */
	public void setOrderFalg(String orderFalg) {
		this.orderFalg = orderFalg;
	}

	/**
	 * @return the modelTime
	 */
	public String getModelTime() {
		return modelTime;
	}

	/**
	 * @param modelTime the modelTime to set
	 */
	public void setModelTime(String modelTime) {
		this.modelTime = modelTime;
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
	 * @return the questionsTagRelationList
	 */
	public List<QuestionsTagRelation> getQuestionsTagRelationList() {
		return questionsTagRelationList;
	}

	/**
	 * @param questionsTagRelationList the questionsTagRelationList to set
	 */
	public void setQuestionsTagRelationList(List<QuestionsTagRelation> questionsTagRelationList) {
		this.questionsTagRelationList = questionsTagRelationList;
	}

	/**
	 * @return the questionsTagId
	 */
	public Long getQuestionsTagId() {
		return questionsTagId;
	}

	/**
	 * @param questionsTagId the questionsTagId to set
	 */
	public void setQuestionsTagId(Long questionsTagId) {
		this.questionsTagId = questionsTagId;
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
	 * @return the commentUserId
	 */
	public Long getCommentUserId() {
		return commentUserId;
	}

	/**
	 * @param commentUserId the commentUserId to set
	 */
	public void setCommentUserId(Long commentUserId) {
		this.commentUserId = commentUserId;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}

	private static final long serialVersionUID = 7687324559966427231L;
    private Long id;// 主键
    private Long cusId;// 创建者
    private String title;// 标题
    private String content;//内容
    private int type;// 分类 1课程问答 2 学习分享
    private int status;// 状态 0可回复1不可回复（采纳最佳答案后改为1 ）
    private int replyCount;// 回复数量
    private int browseCount;// 浏览次数
    private int praiseCount;//点赞数
    private Date addTime;// 添加时间
    
    private String orderFalg="addTime";//排序方式  最新addTime  热门replycount
    private String modelTime;//格式化显示时间
    private String showName;//用户名
    private String email;//用户邮箱
    private String picImg;//用户头像
    private List<QuestionsComment> questionsCommentList;//问答评论list
    private List<QuestionsTagRelation> questionsTagRelationList;//问答和问答标签关联list
    private Long questionsTagId;//问答标签id
    private Date beginCreateTime;//查询 开始添加时间
    private Date endCreateTime;//查询 结束添加时间
    private Long commentUserId;//用于查询我的回答
    
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
        //格式化显示时间
        this.modelTime = getModelDate(addTime);
    }
    
    public String getModelDate(Date oldDate) {
		if (oldDate!=null) {
			Date newDate = new Date();
			long second = (newDate.getTime() - oldDate.getTime()) / 1000L;
			if (second <= 60L)
				return second + "秒前";
			if ((60L < second) && (second <= 3600L)) {
				second /= 60L;
				return second + "分钟前";
			}
			if ((3600L < second) && (second <= 86400L)) {
				second = second / 60L / 60L;
				return second + "小时前";
			}
			if ((86400L < second) && (second <= 864000L)) {
				String formatDate = DateUtils.formatDate(oldDate, "HH:mm");
				second = second / 60L / 60L / 24L;

				return second + "天前";
			}
			return DateUtils.formatDate(oldDate, "yyyy-MM-dd HH:mm");
		}

		return "";
	}
}
