package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 网站配置实体
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteProfile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6689726203603217717L;
	private int id;
	private String type;//类型
	private String desciption;//描述内容JSON格式
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
	 * @return the desciption
	 */
	public String getDesciption() {
		return desciption;
	}
	/**
	 * @param desciption the desciption to set
	 */
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	/**
	 * @return the explain
	 */
	public String getExplain() {
		return explain;
	}
	/**
	 * @param explain the explain to set
	 */
	public void setExplain(String explain) {
		this.explain = explain;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String explain;//说明
}
