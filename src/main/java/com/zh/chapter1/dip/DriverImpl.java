package com.zh.chapter1.dip;

public class DriverImpl implements IDriver {
	private ICar car;
	
	public DriverImpl(){
	}
	
	/**
	 * ���캯��������������
	 * �����Ҫ��ʵ�����ж��幹�캯��
	 * 
	 * Setter���������ͽӿڴ�����������Ҫ�ڽӿ��ж�����Ӧ�ķ���
	 */
	public DriverImpl(ICar car){
		this.car = car;
	}
	/**
	 * Setter����������������
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
