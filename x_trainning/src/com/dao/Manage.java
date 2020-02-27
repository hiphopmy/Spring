package com.dao;

public class Manage {
	Integer no;
	String name;
	Integer age;
	
	public Manage() {

	}

	public Manage(Integer no, String name, Integer age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Manage [no=" + no + ", name=" + name + ", age=" + age + "]\n";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
