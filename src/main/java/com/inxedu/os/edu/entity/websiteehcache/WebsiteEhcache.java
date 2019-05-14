package com.inxedu.os.edu.entity.websiteehcache;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 缓存管理
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WebsiteEhcache implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4611745081384979974L;
	
	private Long id;//主键自增
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
	 * @return the ehcacheKey
	 */
	public String getEhcacheKey() {
		return ehcacheKey;
	}
	/**
	 * @param ehcacheKey the ehcacheKey to set
	 */
	public void setEhcacheKey(String ehcacheKey) {
		this.ehcacheKey = ehcacheKey;
	}
	/**
	 * @return the ehcacheDesc
	 */
	public String getEhcacheDesc() {
		return ehcacheDesc;
	}
	/**
	 * @param ehcacheDesc the ehcacheDesc to set
	 */
	public void setEhcacheDesc(String ehcacheDesc) {
		this.ehcacheDesc = ehcacheDesc;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String ehcacheKey;//ehcache key
	private String ehcacheDesc;//ehcache 描述

}
