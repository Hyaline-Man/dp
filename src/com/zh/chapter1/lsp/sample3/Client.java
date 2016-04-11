package com.zh.chapter1.lsp.sample3;

import java.util.HashMap;
import java.util.Map;

/**
 * 场景类
 * @author zhheng
 *
 */
public class Client {

	public static void main(String[] args) {
		//父类存在的地方，子类就应该存在
		Father f1 = new Father();
		HashMap map1 = new HashMap();
		f1.doSomething(map1);
		//根据里氏替换原则，上述父类出现的地方(即所有Father)，子类可以替换并且输出结果相同,如下
		Son s1 = new Son();
		HashMap map2 = new HashMap();
		s1.doSomething(map2);
		//如果子类中输入参数范围比父类大，则上述替换后输入结果不同，违反了lsp
	}
}
