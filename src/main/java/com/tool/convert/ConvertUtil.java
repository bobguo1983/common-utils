/**
 * 
 */
package com.tool.convert;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author Administrator
 * @version 1.0
 * @Since 2017年7月15日 下午10:29:14
 */
public class ConvertUtil {

	@SuppressWarnings("rawtypes")
	public static <T> String beanToXml(T t, Class cls) throws JAXBException, IOException {
		// 创建输出流
		StringWriter sw = new StringWriter();
		JAXBContext context = JAXBContext.newInstance(cls);
		Marshaller marshller = context.createMarshaller();
		marshller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		// 将对象转换成输出流形式的xml
		marshller.marshal(t, sw);
		String xml = sw.toString();
		sw.close();
		return xml;
	}

	@SuppressWarnings({ "unchecked" })
	public static <T> T xmlToBean(String xml, Class<T> cls) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(cls);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		T unmarshal = (T) unmarshaller.unmarshal(new StringReader(xml));
		return unmarshal;
	}

	/**
	 * 将一个bean对象转换为另一个bean对象
	 * 
	 * @param src
	 * @param srcClass
	 * @param targetClass
	 * @return
	 */
	public static <T, V> T toAnotherBean(V src, Class<V> srcClass, Class<T> targetClass) {
		BeanCopier bc = BeanCopier.create(srcClass, targetClass, false);
		T convertTo = convertTo(src, srcClass, targetClass, null, bc);
		return convertTo;
	}

	/**
	 * 将一个bean对象转换为另一个bean对象,可以自定义转化器
	 * 
	 * @param src
	 * @param srcClass
	 * @param targetClass
	 * @param converter
	 * @param bcCandidate
	 * @return
	 */
	public static <T, V> T convertTo(V src, Class<V> srcClass, Class<T> targetClass, Convertor<V, T> converter, BeanCopier... bcCandidate) {
		if (src == null) {
			return null;
		}
		BeanCopier bc = null;
		if (bcCandidate != null && bcCandidate.length > 0) {
			bc = bcCandidate[0];
		} else {
			bc = BeanCopier.create(srcClass, targetClass, false);
		}
		try {
			T to = targetClass.newInstance();
			bc.copy(src, to, null);
			if (converter != null) {
				converter.convert(src, to);
			}
			return to;
		} catch (Exception e) {
			throw new RuntimeException(String.format("创建%s的实例异常", targetClass));
		}
	}

	public static interface Convertor<V, T> {
		void convert(V src, T target);
	}

	public static BigDecimal toBigDecimal(String num) {
		BigDecimal decimal = new BigDecimal(0);
		if (num != null) {
			decimal = new BigDecimal(num);
		}
		return decimal;
	}
}
