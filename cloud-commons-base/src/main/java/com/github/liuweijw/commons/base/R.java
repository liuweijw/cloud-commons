package com.github.liuweijw.commons.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.github.liuweijw.commons.base.constant.RConstant;

/**
 * 响应信息主体
 *
 * @author liuweijw
 */
@ApiModel(description = "请求返回封装")
public class R<T> implements Serializable {

	private static final long	serialVersionUID	= -6043162591645086533L;

	@ApiModelProperty(value = "返回提示语信息，默认'success'")
	private String				msg					= RConstant.SUCCESS_MSG;

	@ApiModelProperty(value = "返回编码：0 成功 -1 失败 -2 未登录 -3 没权限")
	private int					code				= RConstant.SUCCESS;

	@ApiModelProperty(value = "返回业务数据")
	private T					data;

	public R() {
		super();
	}

	public R<T> success() {
		this.code = RConstant.SUCCESS;
		return this;
	}

	public R<T> success(String msg) {
		this.code = RConstant.SUCCESS;
		this.msg = msg;
		return this;
	}

	public R<T> failure() {
		this.code = RConstant.FAIL;
		return this;
	}

	public R<T> failure(String msg) {
		this.code = RConstant.FAIL;
		this.msg = msg;
		return this;
	}

	public R<T> failure(Throwable e) {
		this.msg = e.getMessage();
		this.code = RConstant.FAIL;
		return this;
	}

	public R<T> code(int code) {
		this.code = code;
		return this;
	}

	public R<T> data(T data) {
		this.data = data;
		return this;
	}

	public static R<String> of(final String msg, final int code) {
		return new R<String>().code(code).failure(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
