package com.yedam.java.ch01_01;

public class Student extends People {
	//필드
	public int studentNo;
	//생성자
	public Student(String name, String ssn, int studentNo) {
		
		super(name, ssn);
		this.name = name;
		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	//메소드
}
