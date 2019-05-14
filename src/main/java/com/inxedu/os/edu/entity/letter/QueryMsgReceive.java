package com.inxedu.os.edu.entity.letter;

import com.inxedu.os.edu.entity.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询站内信接收
 * @author www.inxedu.com
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryMsgReceive implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -2972088766561758830L;
    private Long id;// 主键Id
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
	 * @return the cusId
	 */
	public Long getCusId() {
		return cusId;
	}
	/**
	 * @param cusId the cusId to set
	 */
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the receivingCusId
	 */
	public Long getReceivingCusId() {
		return receivingCusId;
	}
	/**
	 * @param receivingCusId the receivingCusId to set
	 */
	public void setReceivingCusId(Long receivingCusId) {
		this.receivingCusId = receivingCusId;
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
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
	 * @return the cusName
	 */
	public String getCusName() {
		return cusName;
	}
	/**
	 * @param cusName the cusName to set
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the systemNum
	 */
	public int getSystemNum() {
		return systemNum;
	}
	/**
	 * @param systemNum the systemNum to set
	 */
	public void setSystemNum(int systemNum) {
		this.systemNum = systemNum;
	}
	/**
	 * @return the letterNum
	 */
	public int getLetterNum() {
		return letterNum;
	}
	/**
	 * @param letterNum the letterNum to set
	 */
	public void setLetterNum(int letterNum) {
		this.letterNum = letterNum;
	}
	/**
	 * @return the friNum
	 */
	public int getFriNum() {
		return friNum;
	}
	/**
	 * @param friNum the friNum to set
	 */
	public void setFriNum(int friNum) {
		this.friNum = friNum;
	}
	/**
	 * @return the groupNum
	 */
	public int getGroupNum() {
		return groupNum;
	}
	/**
	 * @param groupNum the groupNum to set
	 */
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	/**
	 * @return the unReadNum
	 */
	public int getUnReadNum() {
		return unReadNum;
	}
	/**
	 * @param unReadNum the unReadNum to set
	 */
	public void setUnReadNum(int unReadNum) {
		this.unReadNum = unReadNum;
	}
	/**
	 * @return the showname
	 */
	public String getShowname() {
		return showname;
	}
	/**
	 * @param showname the showname to set
	 */
	public void setShowname(String showname) {
		this.showname = showname;
	}
	/**
	 * @return the userExpandDto
	 */
	public User getUserExpandDto() {
		return userExpandDto;
	}
	/**
	 * @param userExpandDto the userExpandDto to set
	 */
	public void setUserExpandDto(User userExpandDto) {
		this.userExpandDto = userExpandDto;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Long cusId;// 发信人用户id
    private String content;// 信内容
    private Long receivingCusId;// 收信人id
    private Date addTime;// 添加时间
    private Date updateTime;// 更新时间
    private int type;// 类型1系统通知2站内信3请求加好友4申请加入小组
    private int status;// 0未读1已读
    private String cusName;// 用户名
    private Long groupId;// 小组组id申请加入小组组时用到
    private String remarks;// 好友备注
    private String groupName;// 小组名称
    private int systemNum;// 系统消息未读数量
    private int letterNum;// 站内信未读数量
    private int friNum;// 好友请求未读数量
    private int groupNum;// 小组组消息未读数量
    private int unReadNum;// 用户全部未读数量
    private String showname;// 会员名
    private User userExpandDto;// 用户信息
}
