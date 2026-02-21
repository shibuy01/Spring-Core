package com.my.spring;

public class Persion {

	private String name;
	
	private String address;
	
	private int age;

	public Persion(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
