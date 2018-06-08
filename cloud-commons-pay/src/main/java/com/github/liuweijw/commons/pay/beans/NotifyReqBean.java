package com.github.liuweijw.commons.pay.beans;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 支付通知请求Bean
 * 
 * @author liuweijw
 */
@Getter
@Setter
@ToString
public class NotifyReqBean implements Serializable {

	private static final long	serialVersionUID	= -7650462120420037976L;

	private String				payOrderId;

	private String				mchId;

	private String				mchOrderNo;

	private String				channelId;

	private Long				amount;

	private String				currency;

	private Integer				status;

	private String				ip;

	private String				device;

	private String				subject;

	private String				channelOrderNo;

	private String				param1;

	private String				param2;

	private Long				paySuccTime;

	private String				backType;

	private String				sign;

}
