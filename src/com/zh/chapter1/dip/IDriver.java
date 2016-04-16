package com.zh.chapter1.dip;

public interface IDriver {
	/**
	 * 司机的职责函数
	 * 1.构造函数注入时，接口只需要这一个方法
	 * 2.setter方法注入是需要增加set方法，参数中加入相应依赖
	 * 3.接口声明依赖时需要重载职责函数，参数中增加相应依赖
	 */
	public void drive();
	
	/**
	 * setter依赖注入
	 * @param car
	 */
	public void setCar(ICar car);
	
	
	/**
	 * 接口声明依赖对象
	 */
	public void driver(ICar car);
}
