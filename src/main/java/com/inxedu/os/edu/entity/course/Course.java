package com.inxedu.os.edu.entity.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Course implements Serializable{
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the isavaliable
	 */
	public int getIsavaliable() {
		return isavaliable;
	}

	/**
	 * @param isavaliable the isavaliable to set
	 */
	public void setIsavaliable(int isavaliable) {
		this.isavaliable = isavaliable;
	}

	/**
	 * @return the subjectId
	 */
	public int getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * @return the subjectLink
	 */
	public String getSubjectLink() {
		return subjectLink;
	}

	/**
	 * @param subjectLink the subjectLink to set
	 */
	public void setSubjectLink(String subjectLink) {
		this.subjectLink = subjectLink;
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
	 * @return the sourcePrice
	 */
	public java.math.BigDecimal getSourcePrice() {
		return sourcePrice;
	}

	/**
	 * @param sourcePrice the sourcePrice to set
	 */
	public void setSourcePrice(java.math.BigDecimal sourcePrice) {
		this.sourcePrice = sourcePrice;
	}

	/**
	 * @return the currentPrice
	 */
	public java.math.BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @param currentPrice the currentPrice to set
	 */
	public void setCurrentPrice(java.math.BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
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
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * @return the lessionNum
	 */
	public int getLessionNum() {
		return lessionNum;
	}

	/**
	 * @param lessionNum the lessionNum to set
	 */
	public void setLessionNum(int lessionNum) {
		this.lessionNum = lessionNum;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the pageBuycount
	 */
	public int getPageBuycount() {
		return pageBuycount;
	}

	/**
	 * @param pageBuycount the pageBuycount to set
	 */
	public void setPageBuycount(int pageBuycount) {
		this.pageBuycount = pageBuycount;
	}

	/**
	 * @return the pageViewcount
	 */
	public int getPageViewcount() {
		return pageViewcount;
	}

	/**
	 * @param pageViewcount the pageViewcount to set
	 */
	public void setPageViewcount(int pageViewcount) {
		this.pageViewcount = pageViewcount;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the loseType
	 */
	public int getLoseType() {
		return loseType;
	}

	/**
	 * @param loseType the loseType to set
	 */
	public void setLoseType(int loseType) {
		this.loseType = loseType;
	}

	/**
	 * @return the loseTime
	 */
	public String getLoseTime() {
		return loseTime;
	}

	/**
	 * @param loseTime the loseTime to set
	 */
	public void setLoseTime(String loseTime) {
		this.loseTime = loseTime;
	}

	/**
	 * @return the studyPercent
	 */
	public String getStudyPercent() {
		return studyPercent;
	}

	/**
	 * @param studyPercent the studyPercent to set
	 */
	public void setStudyPercent(String studyPercent) {
		this.studyPercent = studyPercent;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	
	private int courseId;
    private String courseName;//课程名称
    private int isavaliable;//1 正常　２　下架   3删除
    private int subjectId;//课程专业ID
    @Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", isavaliable=" + isavaliable
				+ ", subjectId=" + subjectId + ", subjectLink=" + subjectLink + ", addTime=" + addTime
				+ ", sourcePrice=" + sourcePrice + ", currentPrice=" + currentPrice + ", title=" + title + ", context="
				+ context + ", lessionNum=" + lessionNum + ", logo=" + logo + ", updateTime=" + updateTime
				+ ", pageBuycount=" + pageBuycount + ", pageViewcount=" + pageViewcount + ", endTime=" + endTime
				+ ", loseType=" + loseType + ", loseTime=" + loseTime + ", studyPercent=" + studyPercent + "]";
	}

	private String subjectLink;//课程专业链
    private Date addTime;//课程添加时间
    private java.math.BigDecimal sourcePrice;//课程原价格（只显示）
    private java.math.BigDecimal currentPrice;//课程销售价格（实际支付价格）设置为0则可免费观看
    private String title;//课程简介
    private String context;//课程详情
    private int lessionNum;//课时
    private String logo;//课程图片
    private Date updateTime;
    private int pageBuycount;//销售数量
    private int pageViewcount;//浏览数量
    private Date endTime;//有效结束时间
    private int loseType;//有效期类型，0：到期时间，1：按天数
    private String loseTime;//有效期:商品订单过期时间点
    
    private String studyPercent;//课程学习进度百分比
}
