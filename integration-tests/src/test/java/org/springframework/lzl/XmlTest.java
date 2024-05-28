package org.springframework.lzl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lzl.bean.A;
import org.springframework.lzl.bean.B;

public class XmlTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:org/springframework/lzl/beans.xml");
		A a = (A) context.getBean("a");
		B b = (B) context.getBean("b");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(b);
		System.out.println(b.getA());
	}
}
