package com.zh.chapter1.dip;

public class Client {

	public static void main(String[] args) {
		ICar car = new BMW();
		//构造函数注入
		IDriver zhangsan = new DriverImpl(car);
		zhangsan.drive();
		//Setter方法传递依赖对象
		IDriver lisi = new DriverImpl();
		lisi.setCar(car);
		lisi.drive();
		//接口声明依赖对象
		IDriver wangwu = new DriverImpl();
		wangwu.driver(car);
	}

}
