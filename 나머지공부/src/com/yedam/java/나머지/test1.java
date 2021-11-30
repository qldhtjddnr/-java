package com.yedam.java.나머지;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 문제1) 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다고 했을 때 어떤 연산식이 되는 지 구현하세요.
		// 예를 들어, 2, 3, 5를 입력받았을 경우 2 + 3 = 5 를 출력하세요.

		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		// 메뉴는 아래와 같이 구성합니다.
		// input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료

		// 문제 3) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중 최고 수와 최저 수, 수들의 합을 구하는 프로그램을 구현하세요.

		// 문제4) 로또 번호를 구하는 프로그램을 작성하세요.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		System.out.println("세번째 수 : ");
		String strNum3 = scanner.nextLine();

		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3);
		

		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2)); 

	}

}
