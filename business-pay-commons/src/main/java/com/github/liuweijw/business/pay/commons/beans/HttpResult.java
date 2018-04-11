package com.github.liuweijw.business.pay.commons.beans;



/**
 * Http 请求返回
 * 
 * @author LW
 *
 */
public class HttpResult {
	
	private boolean result = false;
	
	private String message = "";
	
	private int code = 0;
	
	/**
	 * 自动会转为: JSONObject 对象
	 */
	private Object data;

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

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
