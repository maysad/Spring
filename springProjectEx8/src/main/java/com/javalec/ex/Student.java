package com.javalec.ex;

public class Student {

	private String name;
	private String age;
	private int gradenum;
	private int classnum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	public int getGradenum() {
		return gradenum;
	}


	public void setGradenum(int gradenum) {
		this.gradenum = gradenum;
	}


	public int getClassnum() {
		return classnum;
	}


	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}


	public void getStudentInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGradenum());
		System.out.println("반 : " + getClassnum());
		
	}
	
}
