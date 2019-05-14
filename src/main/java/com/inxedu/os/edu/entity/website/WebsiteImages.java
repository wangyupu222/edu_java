package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * banner广告图管理
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WebsiteImages implements Serializable{
	private static final long serialVersionUID = 1L;
	private int imageId;
    private String imagesUrl;//图地址
    private String linkAddress;//图连接地址
    private String title;//图标题
    private int typeId;//图片类型ID
    private int seriesNumber;//序列号
    private String previewUrl;//略缩图片地址
    /**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the imagesUrl
	 */
	public String getImagesUrl() {
		return imagesUrl;
	}
	/**
	 * @param imagesUrl the imagesUrl to set
	 */
	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}
	/**
	 * @return the linkAddress
	 */
	public String getLinkAddress() {
		return linkAddress;
	}
	/**
	 * @param linkAddress the linkAddress to set
	 */
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
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
	 * @return the seriesNumber
	 */
	public int getSeriesNumber() {
		return seriesNumber;
	}
	/**
	 * @param seriesNumber the seriesNumber to set
	 */
	public void setSeriesNumber(int seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	/**
	 * @return the previewUrl
	 */
	public String getPreviewUrl() {
		return previewUrl;
	}
	/**
	 * @param previewUrl the previewUrl to set
	 */
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * @param describe the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String color;//背景色
    private String describe;//描述
    
	
}
