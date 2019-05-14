package com.inxedu.os.edu.entity.questions;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 问答标签
 *@author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QuestionsTag implements Serializable {
    private static final long serialVersionUID = -1912600357482790771L;
    private int questionsTagId; // 专业id
    private String questionsTagName;// 专业名称
    /**
	 * @return the questionsTagId
	 */
	public int getQuestionsTagId() {
		return questionsTagId;
	}
	/**
	 * @param questionsTagId the questionsTagId to set
	 */
	public void setQuestionsTagId(int questionsTagId) {
		this.questionsTagId = questionsTagId;
	}
	/**
	 * @return the questionsTagName
	 */
	public String getQuestionsTagName() {
		return questionsTagName;
	}
	/**
	 * @param questionsTagName the questionsTagName to set
	 */
	public void setQuestionsTagName(String questionsTagName) {
		this.questionsTagName = questionsTagName;
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
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int status;// 状态
    private Date createTime;// 创建时间
    private int parentId;// 父节点
}
