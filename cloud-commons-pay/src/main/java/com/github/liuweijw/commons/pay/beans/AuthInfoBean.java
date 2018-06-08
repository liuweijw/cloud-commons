package com.github.liuweijw.commons.pay.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 公众号登录保存到库表的信息
 * 
 * @author liuweijw
 */
@Setter
@Getter
@ToString
@ApiModel("公众号授权登录用户信息")
public class AuthInfoBean implements Serializable {

	private static final long	serialVersionUID	= 5839833513439398323L;

	/**
	 * 数据库id
	 */
	@ApiModelProperty("用户id")
	private Long				id;

	/**
	 * 微信openid
	 */
	@ApiModelProperty("用户openId")
	private String				openId;

	/**
	 * 微信id 可能为空
	 */
	@ApiModelProperty("用户微信号")
	private String				wechatId;

	/**
	 * 微信昵称
	 */
	@ApiModelProperty("用户微信昵称")
	private String				nickName;

	/**
	 * 性别描述
	 */
	@ApiModelProperty("用户性别描述")
	private String				sexDesc;

	/**
	 * 性别
	 */
	@ApiModelProperty("用户性别")
	private Integer				sex;

	/**
	 * 语言
	 */
	@ApiModelProperty("语言")
	private String				language;

	/**
	 * 城市
	 */
	@ApiModelProperty("城市")
	private String				city;

	/**
	 * 省份
	 */
	@ApiModelProperty("省份")
	private String				province;

	/**
	 * 国家
	 */
	@ApiModelProperty("国家")
	private String				country;

	/**
	 * 微信小图片
	 */
	@ApiModelProperty("小图片")
	private String				headImgUrl;

	/**
	 * 描述
	 */
	@ApiModelProperty("描述")
	private String				remark;

}
