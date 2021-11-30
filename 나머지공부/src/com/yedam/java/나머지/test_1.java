package com.yedam.java.나머지;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// 문제1) 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다고 했을 때 어떤 연산식이 되는 지 구현하세요.
		
		
		Scanner scanner = new Scanner(System.in);
		 int x = Integer.parseInt(scanner.nextLine());
		 int y = Integer.parseInt(scanner.nextLine());
		 int z = Integer.parseInt(scanner.nextLine());
		 
		 if(x+y ==z) {
			 System.out.printf("%d + %d = %d\n", x, y, z);
		 }else if (x-y==z) {
			 System.out.printf("%d - %d = %d\n", x, y, z);
		 }else if (x*y==z) {
			 System.out.printf("%d * %d = %d\n", x, y, z);
		 }else if (x/y==z) {
			 System.out.printf("%d / %d = %d\n", x, y, z);
		 }else {
			 System.out.println("성립하는 연산식이 없습니다.");
		 }

	}

}
