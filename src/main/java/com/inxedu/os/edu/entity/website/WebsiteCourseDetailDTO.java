package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/** 推荐课程DTO
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteCourseDetailDTO extends WebsiteCourseDetail implements Serializable {
	private static final long serialVersionUID = 7475674095165175841L;
	private String recommendName;//推荐名称
	private String courseName;//课程名称
	private int isavaliable;//课程是否下架
	private Date endTime;//过期时间
	/**
	 * @return the recommendName
	 */
	public String getRecommendName() {
		return recommendName;
	}
	/**
	 * @param recommendName the recommendName to set
	 */
	public void setRecommendName(String recommendName) {
		this.recommendName = recommendName;
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
	 * @return the loseTime
	 */
	public Long getLoseTime() {
		return loseTime;
	}
	/**
	 * @param loseTime the loseTime to set
	 */
	public void setLoseTime(Long loseTime) {
		this.loseTime = loseTime;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Long loseTime;//过期时间点
}
