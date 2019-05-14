package com.inxedu.os.edu.entity.kpoint;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseKpoint implements Serializable{
    private static final long serialVersionUID = -2252970709827434582L;
    /**视频节点ID*/
    private int kpointId;
    /**课程ID*/
    private int courseId;
    /**视频名*/
    private String name;
    /**视频父节点*/
    private int parentId;
    public int getKpointId() {
		return kpointId;
	}
	public void setKpointId(int kpointId) {
		this.kpointId = kpointId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getPlayCount() {
		return playCount;
	}
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int free) {
		this.free = free;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getPlayTime() {
		return playTime;
	}
	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}
	public int getKpointType() {
		return kpointType;
	}
	public void setKpointType(int kpointType) {
		this.kpointType = kpointType;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public List<CourseKpoint> getKpointList() {
		return kpointList;
	}
	public void setKpointList(List<CourseKpoint> kpointList) {
		this.kpointList = kpointList;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**创建时间*/
    private Date addTime;
    /**排序*/
    private int sort;
    /**播放次数*/
    private int playCount;
    /**是否是免费 1免费 2收费*/
    private int free;
    /**视频路径*/
    private String videoUrl;
    /**教师ID*/
    private int teacherId;
    /**播放时间*/
    private String playTime;
    /**节点类型 0文件目录 1视频*/
    private int kpointType;
    /** 视频类型 */
    private String videoType;
    /**节点list*/
    private List<CourseKpoint> kpointList=new ArrayList<CourseKpoint>();
    private String fileType;//节点文件格式
    private String content;//文本内容

}
