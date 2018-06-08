package com.github.liuweijw.commons.base.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 分页bean的扩展
 * 
 * @author liuweijw
 * @param <T>
 */
@Getter
@Setter
@ApiModel(description = "分页数据扩展Bean")
public class ExtentPageBean<T> extends PageBean<T> {

	private static final long	serialVersionUID	= -6753009299925938654L;

	@ApiModelProperty("分页数据扩展字符串字段key1")
	private String				key1;

	@ApiModelProperty("分页数据扩展字符串字段key2")
	private String				key2;

	@ApiModelProperty("分页数据扩展字符串字段key3")
	private String				key3;

	@ApiModelProperty("分页数据扩展字符串字段key4")
	private String				key4;

	@ApiModelProperty("分页数据扩展数据字段num1")
	private Integer				num1				= 0;

	@ApiModelProperty("分页数据扩展数据字段num2")
	private Integer				num2				= 0;

}
