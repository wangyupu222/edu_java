package com.inxedu.os.edu.entity.teacher;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 讲师实体
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 838162101564081713L;
    private int id;// 主键自增
    private String name;// 讲师名称
    private String education;// 讲师资历
    private String career;// 讲师简介
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @return the career
	 */
	public String getCareer() {
		return career;
	}
	/**
	 * @param career the career to set
	 */
	public void setCareer(String career) {
		this.career = career;
	}
	/**
	 * @return the isStar
	 */
	public int getIsStar() {
		return isStar;
	}
	/**
	 * @param isStar the isStar to set
	 */
	public void setIsStar(int isStar) {
		this.isStar = isStar;
	}
	/**
	 * @return the picPath
	 */
	public String getPicPath() {
		return picPath;
	}
	/**
	 * @param picPath the picPath to set
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
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
	 * @return the updateTime
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
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
	 * @return the sort
	 */
	public int getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int isStar;// 头衔 1高级讲师2首席讲师
    private String picPath;// 头像
    private int status;// 状态:0正常1删除
    private java.util.Date createTime;// 创建时间
    private java.util.Date updateTime;// 更新时间
    private int subjectId;//专业ID
    private int sort;//排序
}
