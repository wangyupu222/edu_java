package com.inxedu.os.edu.entity.questions;

import java.io.Serializable;

import lombok.Data;

/**
 * 问答和 问答标签的 关联表
 *@author www.inxedu.com
 */
@Data
public class QuestionsTagRelation implements Serializable{
	private static final long serialVersionUID = 7687324559966427231L;
	private Long id;//id
	private Long questionsId;//问答id
	private Long questionsTagId;//问答标签id
	
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
	 * @return the questionsId
	 */
	public Long getQuestionsId() {
		return questionsId;
	}

	/**
	 * @param questionsId the questionsId to set
	 */
	public void setQuestionsId(Long questionsId) {
		this.questionsId = questionsId;
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
	 * @return the tagName
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * @param tagName the tagName to set
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String tagName;//问答标签名
}
