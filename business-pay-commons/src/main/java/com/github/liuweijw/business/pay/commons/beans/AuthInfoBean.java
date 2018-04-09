package com.github.liuweijw.business.pay.commons.beans;

import java.io.Serializable;

/**
 * 公众号登录保存到库表的信息
 * 
 * @author liuweijw
 *
 */
public class AuthInfoBean implements Serializable {

	private static final long serialVersionUID = 5839833513439398323L;

	/**
	 * 数据库id
	 */
	private Long id;

	/**
	 * 微信openid
	 */
	private String openId;
	
	/**
	 * 微信昵称
	 */
	private String nickName;

	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 语言
	 */
	private String language;
	 
	/**
	 * 城市
	 */
	private String city;
	 
	/**
	 * 省份
	 */
	private String province;
	 
	/**
	 * 国家
	 */
	private String country;
	 
	/**
	 * 微信小图片
	 */
	private String headImgUrl;
	
	/**
	 * 描述
	 */
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
