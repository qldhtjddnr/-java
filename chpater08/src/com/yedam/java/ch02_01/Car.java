package com.yedam.java.ch02_01;

public class Car {
	// 필드
	Tire frontLeftTire = new HankukTire();
	Tire frontRightTire = new HankukTire();
	Tire backLeftTire = new HankukTire();
	Tire backRightTire = new HankukTire();

	// 메소드
	/*void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}*/
	
	Tire[] tires = {
			new HankukTire(),
			new HankukTire(),
			new HankukTire(),
			new HankukTire(),
	};
	
	void run() {
		for(Tire tire : tires)
			tire.roll();
	}
}