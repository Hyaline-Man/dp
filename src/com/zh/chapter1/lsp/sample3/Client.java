package com.zh.chapter1.lsp.sample3;

import java.util.HashMap;
import java.util.Map;

/**
 * ������
 * @author zhheng
 *
 */
public class Client {

	public static void main(String[] args) {
		//������ڵĵط��������Ӧ�ô���
		Father f1 = new Father();
		HashMap map1 = new HashMap();
		f1.doSomething(map1);
		//���������滻ԭ������������ֵĵط�(������Father)����������滻������������ͬ,����
		Son s1 = new Son();
		HashMap map2 = new HashMap();
		s1.doSomething(map2);
		//������������������Χ�ȸ�����������滻����������ͬ��Υ����lsp
	}
}
