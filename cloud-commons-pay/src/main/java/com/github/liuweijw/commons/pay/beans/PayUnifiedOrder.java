package com.github.liuweijw.commons.pay.beans;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 统一下单服务Bean
 * 
 * @author liuweijw
 */
@Getter
@Setter
@ToString
public class PayUnifiedOrder implements Serializable {

	private static final long	serialVersionUID	= -4417796108118232752L;

	/**
	 * 商户id 必填
	 */
	private String				mchId;

	/**
	 * 商户订单号 必填
	 */
	private String				mchOrderNo;

	/**
	 * 支付渠道ID, WX_NATIVE,ALIPAY_WAP 必填
	 */
	private String				channelId;

	/**
	 * 支付金额,单位分 必填
	 */
	private Long				amount;

	/**
	 * 币种, cny-人民币 必填
	 */
	private String				currency			= "cny";

	/**
	 * 用户地址,IP或手机号 必填
	 */
	private String				ip;

	/**
	 * 设备 "WEB" 必填
	 */
	private String				device;

	/**
	 * 简介 必填
	 */
	private String				subject;

	/**
	 * 介绍 必填
	 */
	private String				body;

	/**
	 * 业务回调URL 必填
	 */
	private String				notifyUrl;

	/**
	 * 扩展参数1 选填
	 */
	private String				param1;

	/**
	 * 扩展参数2 选填
	 */
	private String				param2;

	/**
	 * 附加参数 JSON "{\"productId\":\"xxx\",\"openId\":\"xxx\"}"
	 */
	private String				extra;

	/**
	 * 上述字段 签名
	 */
	private String				sign;

}
