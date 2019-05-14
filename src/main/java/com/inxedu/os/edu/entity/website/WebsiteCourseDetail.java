package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @description 推荐课程
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteCourseDetail implements Serializable {
	private static final long serialVersionUID = 7475674095165175841L;

	private int id;// 主键
	private int recommendId;// 分类id
	private int courseId;// 课程id
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the recommendId
	 */
	public int getRecommendId() {
		return recommendId;
	}
	/**
	 * @param recommendId the recommendId to set
	 */
	public void setRecommendId(int recommendId) {
		this.recommendId = recommendId;
	}
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
	 * @return the orderNum
	 */
	public int getOrderNum() {
		return orderNum;
	}
	/**
	 * @param orderNum the orderNum to set
	 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int orderNum;// 排序值
}
