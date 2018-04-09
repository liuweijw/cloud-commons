package com.github.liuweijw.business.pay.commons.enums;

public enum WxTemplateEnum {

	/**
	 * 下单成功提醒
	 * {{first.DATA}}
		商家名称：{{keyword1.DATA}}
		下单时间：{{keyword2.DATA}}
		商品明细：{{keyword3.DATA}}
		订单金额：{{keyword4.DATA}}
		{{remark.DATA}}
	 */
	PUT_ORDER_SUC("WsGvQ-MU3eeZyq_Lng1bjGbg5F30-B1RxW9VfpW1j48"),
	
	/**
	 * 订单消息通知
	 * 
	 * {{first.DATA}}
		订单号：{{keyword1.DATA}}
		金额：{{keyword2.DATA}}
		时间：{{keyword3.DATA}}
		买家：{{keyword4.DATA}}
		联系方式：{{keyword5.DATA}}
		{{remark.DATA}}
	 */
	PUT_ORDER_MSG("4vvJ8hJJ8xqSu-odfnPmHKQ8hHz1RkYzFr-7YQEEohw"),
	
	/**
	 * 订单支付成功通知
	 * 
	 * {{first.DATA}}
		商品名称：{{keyword1.DATA}}
		订单编号：{{keyword2.DATA}}
		支付金额：{{keyword3.DATA}}
		{{remark.DATA}}
	 */
	PAY_ORDER_SUC("HA0soJ3k7mONXIZJa317gEMr3PNlIyMgRnmoC2Slj-c"),
	
	/**
	 * 订单取消通知
	 * 
	 * {{first.DATA}}
		订单编号：{{keyword1.DATA}}
		订单金额：{{keyword2.DATA}}
		{{remark.DATA}}
	 */
	PUT_ORDER_CANCEL("siO0h7N6dFg4kCyeKvZIntI0Ld5CaPHF0j_5Nu1xF14"),
	
	/**
	 * 订单修改成功通知
	 * 
	 * {{first.DATA}}
		门店名称：{{keyword1.DATA}}
		订单编号：{{keyword2.DATA}}
		修改内容：{{keyword3.DATA}}
		修改时间：{{keyword4.DATA}}
		{{remark.DATA}}
	 */
	PUT_ORDER_MODIFY("06pJ7dnF6zbN_kX0kqU0yH-A--Ulp8soxTBQ8Yc21-k");
	
	private String templateId;
	
	private WxTemplateEnum(String templateId){
		this.templateId = templateId;
	}

	public String getTemplateId() {
		return templateId;
	}
	
	public static WxTemplateEnum of(String templateId) {
		for (WxTemplateEnum template : WxTemplateEnum.values()) {
			if (template.getTemplateId().equals(templateId)) {
				return template;
			}
		}
		return null;
	}

}
