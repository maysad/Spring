package com.javalec.ex;

public class Student {
	
	private String name;
	private String age;
	
	public Student(String name, String age) {
		this.name=name;
		this.age=age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}
	
	
}
