package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 导航
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteNavigate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the newPage
	 */
	public int getNewPage() {
		return newPage;
	}
	/**
	 * @param newPage the newPage to set
	 */
	public void setNewPage(int newPage) {
		this.newPage = newPage;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int id;
	/**
	 * 导航的名称
	 */
	private String name;
	/**
	 * 跳转链接
	 */
	private String url;
	/**
	 * 是否在新页面打开0是1否
	 */
	private int newPage;
	/**
	 *  INDEX首页、USER个人中心、FRIENDLINK尾部友链、TAB尾部标签
	 */
	private String type;
	/**
	 * 显示排序
	 */
	private int orderNum;
	/**
	 * 0正常1冻结
	 */
	private int status ;
}
