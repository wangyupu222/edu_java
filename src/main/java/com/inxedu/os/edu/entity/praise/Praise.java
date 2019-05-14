package com.inxedu.os.edu.entity.praise;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 点赞表
 *@author www.inxedu.com
 */
@Data
public class Praise  implements Serializable{
	private static final long serialVersionUID = 7687324559966427231L;
	private Long id;//id
	private Long userId;//用户id
	private Long targetId;//点赞的目标id
	private int type;//点赞类型 1问答点赞 2问答评论点赞
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
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the targetId
	 */
	public Long getTargetId() {
		return targetId;
	}
	/**
	 * @param targetId the targetId to set
	 */
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Date addTime;//点赞和点踩的时间

}
