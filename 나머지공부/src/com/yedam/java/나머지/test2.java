package com.yedam.java.나머지;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
				// 메뉴는 아래와 같이 구성합니다.
				// input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료
		
		
		Scanner scanner =new Scanner(System.in);
		
		boolean run = true;
		
		int[] input = null;
		int num = 0;
		
		while(run) {
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
			
			System.out.println("입력> ");
			String selectNo = scanner.nextLine();
			
			switch(selectNo) {
			case 1:
				System.out.println("input.숫자입력");
				num = Integer.parseInt(scanner.nextLine());
				
				break;
			}
		}
	}

}
