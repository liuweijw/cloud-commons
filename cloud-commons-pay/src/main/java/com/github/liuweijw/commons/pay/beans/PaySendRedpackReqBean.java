package com.github.liuweijw.commons.pay.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 发送普通红包或者裂变红包请求参数
 * https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_4&index=3
 * https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_5&index=4
 * https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_6&index=5
 * 
 * @author liuweijw
 */
@Getter
@Setter
@ToString
public class PaySendRedpackReqBean {

	/**
	 * 业务数据签名 必填
	 */
	private String	sign;

	/**
	 * 红包类型 0 普通红包 1 裂变红包 必填
	 */
	private Integer	redPackType;

	/**
	 * 商户id 必填
	 */
	private String	mchId;

	/**
	 * 商户订单号 必填
	 */
	private String	mchOrderNo;

	/**
	 * 红包默认采用 "WX_JSAPI"
	 */
	private String	channelId	= "WX_JSAPI";

	/**
	 * 用户openid 必填
	 */
	private String	openId;

	/**
	 * 红包发放总金额，即一组红包金额总和，包括分享者的红包和裂变的红包，单位分 必填
	 */
	private Integer	totalAmount;

	/**
	 * 红包发放总人数，即总共有多少人可以领到该组红包（包括分享者） 必填
	 */
	private Integer	totalNum;

	/**
	 * 红包金额设置方式 必填
	 * ALL_RAND—全部随机,商户指定总金额和红包发放总人数，由微信支付随机计算出各红包金额
	 */
	private String	amtType;

	/**
	 * 红包祝福语 必填
	 */
	private String	wishing;

	/**
	 * Ip地址 必填
	 */
	private String	ip;

	/**
	 * 活动名称 必填
	 */
	private String	actName;

	/**
	 * 备注 必填
	 * ex: 猜越多得越多，快来抢！
	 */
	private String	remark;

	/**
	 * 非必填
	 * PRODUCT_1:商品促销
	 * PRODUCT_2:抽奖
	 * PRODUCT_3:虚拟物品兑奖
	 * PRODUCT_4:企业内部福利
	 * PRODUCT_5:渠道分润
	 * PRODUCT_6:保险回馈
	 * PRODUCT_7:彩票派奖
	 * PRODUCT_8:税务刮奖
	 */
	private String	sceneId;

	/**
	 * 活动信息 非必填
	 * posttime:用户操作的时间戳
	 * mobile:业务系统账号的手机号，国家代码-手机号。不需要+号
	 * deviceid :mac 地址或者设备唯一标识
	 * clientversion :用户操作的客户端版本
	 * 把值为非空的信息用key=value进行拼接，再进行urlencode
	 * urlencode(posttime=xx& mobile =xx&deviceid=xx)
	 */
	private String	riskInfo;

	/**
	 * 资金授权商户号 非必填
	 * 服务商替特约商户发放时使用
	 */
	private String	consumeMchId;
}
