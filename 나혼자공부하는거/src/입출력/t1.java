package 입출력;

import java.util.Scanner;

public class t1 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		System.out.println(i*1000);
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {//has는 끝내지않고 바로 또 실행하게 만들어 준다. 밑에는 숫자가 아닌경우는 실행을 종료시켜준다.
			System.out.println(sc.nextInt() * 100);
		}
		
		sc.close();
		
		
		
		
	}

}

