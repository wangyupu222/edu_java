package com.inxedu.os.edu.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 推荐分类
 * @author www.inxedu.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteCourse implements Serializable {
	private static final long serialVersionUID = 1383373953853661904L;

	private int id;// 分类id
	private String name;//分类名称
	private String link;//更多链接
	private String description;//详细描述 Sr
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
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the courseNum
	 */
	public int getCourseNum() {
		return courseNum;
	}
	/**
	 * @param courseNum the courseNum to set
	 */
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int courseNum;//数量限制
}
