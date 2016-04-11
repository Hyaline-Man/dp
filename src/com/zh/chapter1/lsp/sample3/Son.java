package com.zh.chapter1.lsp.sample3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
	/**
	 * 子类放大了父类中同名方法的输入参数范围
	 * 因为子类继承，所有拥有父类的doSomething(HashMap map)方法
	 * 此方法实际上是对父类中同名方法的重载
	 * @param map
	 * @return
	 */
	public Collection doSomething(Map map){
		System.out.println("子类被执行。。。");
		return map.values();
	}
}
