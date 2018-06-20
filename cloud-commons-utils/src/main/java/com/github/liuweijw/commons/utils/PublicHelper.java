package com.github.liuweijw.commons.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 公共常用相关的工具类
 * 
 * @author liuweijw
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PublicHelper {

	/**
	 * 判断是否为空（字符串、Collection、map） <br>
	 * null,"", "null" 返回 false <br>
	 * Collection,map 为空或者 size == 0 返回 false
	 * 
	 * @return true 为空 false 不为空
	 */
	public static boolean isEmpty(Object obj) {
		if (null == obj) { return true; }
		if (obj instanceof String) {
			return ((String) obj).length() == 0 || "null".equals(obj);
		} else if (obj instanceof Collection) {
			return ((Collection<?>) obj).isEmpty();
		} else if (obj instanceof Map) { return ((Map<?, ?>) obj).size() == 0; }
		return false;
	}

	/**
	 * 判断是否为空（字符串、Collection、map） <br>
	 * null,"", "null" 返回 false <br>
	 * Collection,map 为空或者 size == 0 返回 false
	 * 
	 * @return true 不为空 false 为空
	 */
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

	/**
	 * 创建Map<String,String>
	 * 
	 * @return Map<String,String>
	 */
	public static Map<String, String> newStringMap() {
		return new HashMap<String, String>();
	}

	/**
	 * 创建Map<String,Object>
	 * 
	 * @return Map<String,Object>
	 */
	public static Map<String, Object> newObjectMap() {
		return new HashMap<String, Object>();
	}

	/**
	 * 创建ArrayList<String>
	 * 
	 * @return
	 */
	public static List<String> newStringList() {
		return new ArrayList<String>();
	}

	/**
	 * 创建ArrayList<Object>
	 * 
	 * @return
	 */
	public static List<Object> newObjectList() {
		return new ArrayList<Object>();
	}

}
