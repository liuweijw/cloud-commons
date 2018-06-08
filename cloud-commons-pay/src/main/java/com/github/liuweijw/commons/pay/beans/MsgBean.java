package com.github.liuweijw.commons.pay.beans;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 公众号消息发送Bean
 * 
 * @author liuweijw
 */
@Getter
@Setter
public class MsgBean implements Serializable {

	private static final long	serialVersionUID	= -5924329660992236740L;

	private String				first;

	private String				keyword1;

	private String				keyword2;

	private String				keyword3;

	private String				keyword4;

	private String				keyword5;

	/**
	 * 如果存在，则发送给用户 如果不存在，则只发送给管理员
	 */
	private List<String>		toUser;

	private String				remark;

	/**
	 * 不为空则设置点击链接
	 */
	private String				linkUrl;

	private String				templateId;

}
