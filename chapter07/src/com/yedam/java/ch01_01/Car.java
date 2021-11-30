package com.yedam.java.ch01_01;

public class Car {
	//필드
	public int speed;
	
	//생성자
	
	//메소드
	public void speedUp() {
		speed++;
	}
	public final /*접근제한자와 타입사이에 붙여주면됨*/void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
