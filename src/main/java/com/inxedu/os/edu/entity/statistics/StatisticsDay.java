package com.inxedu.os.edu.entity.statistics;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StatisticsDay implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
	private Long id;
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
	 * @return the statisticsTime
	 */
	public java.util.Date getStatisticsTime() {
		return statisticsTime;
	}
	/**
	 * @param statisticsTime the statisticsTime to set
	 */
	public void setStatisticsTime(java.util.Date statisticsTime) {
		this.statisticsTime = statisticsTime;
	}
	/**
	 * @return the loginNum
	 */
	public Long getLoginNum() {
		return loginNum;
	}
	/**
	 * @param loginNum the loginNum to set
	 */
	public void setLoginNum(Long loginNum) {
		this.loginNum = loginNum;
	}
	/**
	 * @return the createTime
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the registeredNum
	 */
	public Long getRegisteredNum() {
		return registeredNum;
	}
	/**
	 * @param registeredNum the registeredNum to set
	 */
	public void setRegisteredNum(Long registeredNum) {
		this.registeredNum = registeredNum;
	}
	/**
	 * @return the videoViewingNum
	 */
	public Long getVideoViewingNum() {
		return videoViewingNum;
	}
	/**
	 * @param videoViewingNum the videoViewingNum to set
	 */
	public void setVideoViewingNum(Long videoViewingNum) {
		this.videoViewingNum = videoViewingNum;
	}
	/**
	 * @return the dailyUserNumber
	 */
	public Long getDailyUserNumber() {
		return dailyUserNumber;
	}
	/**
	 * @param dailyUserNumber the dailyUserNumber to set
	 */
	public void setDailyUserNumber(Long dailyUserNumber) {
		this.dailyUserNumber = dailyUserNumber;
	}
	/**
	 * @return the dailyCourseNumber
	 */
	public Long getDailyCourseNumber() {
		return dailyCourseNumber;
	}
	/**
	 * @param dailyCourseNumber the dailyCourseNumber to set
	 */
	public void setDailyCourseNumber(Long dailyCourseNumber) {
		this.dailyCourseNumber = dailyCourseNumber;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 统计日期
	 */
    private java.util.Date statisticsTime;
    /**
     * 登录人数（活跃人数 ）
     */
    private Long loginNum;
    /**
     *  生成时间
     */
    private java.util.Date createTime;
    /**
     * 注册人数
     */
    private Long registeredNum;
    /**
     * 每日播放视频数
     */
    private Long videoViewingNum;
    /**
     * 每日用户数
     */
    private Long dailyUserNumber;
    /**
     * 每日课程数
     */
    private Long dailyCourseNumber;
}
