package com.zh.chapter1.dip;

public interface IDriver {
	/**
	 * ˾����ְ����
	 * 1.���캯��ע��ʱ���ӿ�ֻ��Ҫ��һ������
	 * 2.setter����ע������Ҫ����set�����������м�����Ӧ����
	 * 3.�ӿ���������ʱ��Ҫ����ְ������������������Ӧ����
	 */
	public void drive();
	
	/**
	 * setter����ע��
	 * @param car
	 */
	public void setCar(ICar car);
	
	
	/**
	 * �ӿ�������������
	 */
	public void driver(ICar car);
}
