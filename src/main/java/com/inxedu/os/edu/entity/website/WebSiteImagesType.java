package com.inxedu.os.edu.entity.website;

import lombok.Data;

import java.io.Serializable;

/**
 * 广告图片类型
 * @author www.inxedu.com
 */
@Data
public class WebSiteImagesType implements Serializable{
	private static final long serialVersionUID = 1L;
	/**类型ID*/
	private int typeId;
	/**类型名*/
	private String typeName;
	/**
	 * @return the typeId
	 */
	public int getTypeId() {
		return typeId;
	}
	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}
	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
