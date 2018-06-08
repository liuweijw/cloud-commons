package com.github.liuweijw.commons.pay.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Http 请求返回
 * 
 * @author LW
 */
@Setter
@Getter
@ApiModel("请求返回信息")
public class HttpResult {

	@ApiModelProperty("默认成功")
	private boolean	result	= false;

	@ApiModelProperty("请求返回消息")
	private String	message	= "";

	@ApiModelProperty("请求返回编码")
	private int		code	= 0;

	@ApiModelProperty("请求返回JSONObject对象")
	private Object	data;

	public HttpResult success() {
		this.result = true;
		return this;
	}

	public HttpResult success(String message) {
		this.result = true;
		this.message = message;
		return this;
	}

	public HttpResult failure() {
		this.result = false;
		return this;
	}

	public HttpResult code(int code) {
		this.code = code;
		return this;
	}

	public HttpResult failure(String message) {
		this.result = false;
		this.message = message;
		return this;
	}

	public HttpResult data(Object data) {
		this.data = data;
		return this;
	}

}
