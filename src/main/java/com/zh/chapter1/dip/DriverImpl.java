package com.zh.chapter1.dip;

public class DriverImpl implements IDriver {
	private ICar car;
	
	public DriverImpl(){
	}
	
	/**
	 * 构造函数传递依赖对象
	 * 这个需要在实现类中定义构造函数
	 * 
	 * Setter传递依赖和接口传递依赖都需要在接口中定义相应的方法
	 */
	public DriverImpl(ICar car){
		this.car = car;
	}
	/**
	 * Setter方法传递依赖对象
	 * @param car
	 */
	@Override
	public void setCar(ICar car){
		this.car = car;
	}
	
	@Override
	public void drive() {
		this.car.run();
	}

	@Override
	public void driver(ICar car) {
		car.run();
	}
	
}
