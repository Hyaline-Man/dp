package com.zh.chapter1.lsp.sample3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
	/**
	 * ����Ŵ��˸�����ͬ�����������������Χ
	 * ��Ϊ����̳У�����ӵ�и����doSomething(HashMap map)����
	 * �˷���ʵ�����ǶԸ�����ͬ������������
	 * @param map
	 * @return
	 */
	public Collection doSomething(Map map){
		System.out.println("���౻ִ�С�����");
		return map.values();
	}
}
