package com.inxedu.os.edu.entity.user;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 查询用户
 * @author www.inxedu.com
 *
 */
@Data
public class QueryUser {
	private int isavalible;
	private String keyWord;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date beginCreateTime;//查询 开始注册时间
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endCreateTime;//查询 结束注册时间
	/**
	 * @return the isavalible
	 */
	public int getIsavalible() {
		return isavalible;
	}
	/**
	 * @param isavalible the isavalible to set
	 */
	public void setIsavalible(int isavalible) {
		this.isavalible = isavalible;
	}
	/**
	 * @return the keyWord
	 */
	public String getKeyWord() {
		return keyWord;
	}
	/**
	 * @param keyWord the keyWord to set
	 */
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
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
}
