package com.yedam.java.ch01_01;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL =1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL; //값 초기화 시켜 플라이모드가 노멀모드로 만들어버림
	
	@Override
	public void fly() {
		if(flyMode == SupersonicAirplane.SUPERSONIC){
			System.out.println("초읍속비행합니다.");
		}else {
			super.fly();
			
		}
	}

}
