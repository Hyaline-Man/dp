package com.zh.chapter1.dip;

public class Client {

	public static void main(String[] args) {
		ICar car = new BMW();
		//���캯��ע��
		IDriver zhangsan = new DriverImpl(car);
		zhangsan.drive();
		//Setter����������������
		IDriver lisi = new DriverImpl();
		lisi.setCar(car);
		lisi.drive();
		//�ӿ�������������
		IDriver wangwu = new DriverImpl();
		wangwu.driver(car);
	}

}
