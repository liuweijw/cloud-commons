package com.github.liuweijw.business.pay.commons.beans;

import java.io.Serializable;
import java.util.List;

/**
 * 公众号消息发送Bean
 * 
 * @author liuweijw
 *
 */
public class MsgBean implements Serializable {

	private static final long serialVersionUID = -5924329660992236740L;

	private String first;
	
	private String keyword1;
	
	private String keyword2;
	
	private String keyword3;
	
	private String keyword4;
	
	private String keyword5;
	
	/**
	 * 如果存在，则发送给用户  如果不存在，则只发送给管理员
	 */
	private List<String> toUser;
	
	private String remark;
	
	/**
	 * 不为空则设置点击链接
	 */
	private String linkUrl;
	
	private String templateId;
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getKeyword1() {
		return keyword1;
	}

	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}

	public String getKeyword2() {
		return keyword2;
	}

	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}

	public String getKeyword3() {
		return keyword3;
	}

	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}

	public String getKeyword4() {
		return keyword4;
	}

	public void setKeyword4(String keyword4) {
		this.keyword4 = keyword4;
	}

	public String getKeyword5() {
		return keyword5;
	}

	public void setKeyword5(String keyword5) {
		this.keyword5 = keyword5;
	}

	public List<String> getToUser() {
		return toUser;
	}

	public void setToUser(List<String> toUser) {
		this.toUser = toUser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
