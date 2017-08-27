package com.tool.validate;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 空校验工具类:包括校验字符串，Map,List,Set等
 * 
 * @author Administrator
 * 
 */
public class EmptyValidationUtil {

	/**
	 * 校验字符串是否为空或者为空串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断某个map集合是否为空或者没有键值对
	 * 
	 * @param map
	 * @return
	 */
	public static <K, V> boolean isEmpty(Map<K, V> map) {
		if (map != null && !map.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * 判断一个List是否为空或者是否有元素
	 * 
	 * @param list
	 * @return
	 */
	public static <T> boolean isEmpty(List<T> list) {
		if (list != null && list.size() > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断一个Set是否为空或者是否有元素
	 * 
	 * @param set
	 * @return
	 */
	public static <T> boolean isEmpty(Set<T> set) {
		if (set != null && set.size() > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(Object[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个整型数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(int[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个byte数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(byte[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个char数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(char[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个short数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(short[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个long数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(long[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个double数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(double[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个float数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(float[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断某个boolean数组是否为空或者没有元素
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isEmpty(boolean[] object) {
		if (object != null && object.length > 0) {
			return false;
		}
		return true;
	}
}
