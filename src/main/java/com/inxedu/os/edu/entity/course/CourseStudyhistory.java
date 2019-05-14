package com.inxedu.os.edu.entity.course;

import com.inxedu.os.common.util.StringUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName com.inxedu.os.inxedu.entity.course.CourseStudyhistory
 * @description 记录播放记录
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseStudyhistory implements Serializable {
	/**
     * 
     */
    private static final long serialVersionUID = 5434482371608343070L;
    private Long id;
    private Long userId;//播放次数
    private Long courseId;//播放次数
    private Long kpointId;//播放次数
    private Long playercount;//播放次数
    private String courseName;//课程名称
    private String kpointName;//节点名称
    private String databack;//playercount小于20时记录,备注观看的时间，叠加
    private java.util.Date updateTime;//更新时间
    private String logo;	//图片
    private String teacherName;	//教师名称
    
    private String userShowName;//用户名
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getKpointId() {
		return kpointId;
	}

	public void setKpointId(Long kpointId) {
		this.kpointId = kpointId;
	}

	public Long getPlayercount() {
		return playercount;
	}

	public void setPlayercount(Long playercount) {
		this.playercount = playercount;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getKpointName() {
		return kpointName;
	}

	public void setKpointName(String kpointName) {
		this.kpointName = kpointName;
	}

	public String getDataback() {
		return databack;
	}

	public void setDataback(String databack) {
		this.databack = databack;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getUserShowName() {
		return userShowName;
	}

	public void setUserShowName(String userShowName) {
		this.userShowName = userShowName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public int getQueryLimit() {
		return queryLimit;
	}

	public void setQueryLimit(int queryLimit) {
		this.queryLimit = queryLimit;
	}

	public String getPicImg() {
		return picImg;
	}

	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getUpdateTimeFormat() {
		return updateTimeFormat;
	}

	public void setUpdateTimeFormat(String updateTimeFormat) {
		this.updateTimeFormat = updateTimeFormat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	private String userEmail;//用户邮箱
    private String userImg;//用户头像

    //辅助字段
    private int queryLimit;//查询 的个数
    private String picImg;//用户头像
    private String showName;//用户昵称
    private String updateTimeFormat;//时间 格式化显示

    public void setUpdateTime(Date date){
        this.updateTime=date;
        this.updateTimeFormat= StringUtils.getModelDate(this.getUpdateTime());
    }
}
