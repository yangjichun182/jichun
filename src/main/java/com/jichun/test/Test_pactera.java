package com.jichun.test;

import com.jichun.utils.Unicode2Chinese;

public class Test_pactera {
	public static void main(String[] args) {
//		Unicode2Chinese uni = new Unicode2Chinese();
		String decodeUnicode = Unicode2Chinese.decodeUnicode("\\u007c\\u001b");
		System.out.println(decodeUnicode);
	}

	public static void test() {
//		java.util.ArrayList
//		java.lang.Iterable
//		java.beans.beancontext.BeanContext
	}
}
