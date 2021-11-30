package 재시험;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {

	

		boolean run = true;
		int goodsNum = 0;
		int[] price = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("=== 1.학생수 입력 | 2.학생점수 입력 | 3.학생점수 전체조회 | 4.학생점수 분석 | 5. 종료 ===");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수 > ");
				goodsNum = Integer.parseInt(scanner.nextLine());
				price = new int[goodsNum];
				

			} else if (selectNo == 2) {
				if (goodsNum > 0) {
					for (int k = 0; k < price.length; k++) {
						System.out.println("점수:");
						price[k] = Integer.parseInt(scanner.nextLine());
					}
				
				}
				
				
			} else if (selectNo == 3) {
				for (int i = 0; i < price.length; i++) {
					System.out.println("점수[" + "학생"+( i+1 )+ "점수"+"] : " + price[i]);
					
				}
				
				
				
			} else if (selectNo == 4) {
				System.out.print("분석 > ");
				int max = price[0];
				int min = price[0];
				
				
				
				for (int i = 0; i < (price.length) - 1; i++) {
					if (max < price[i])  max=price[i]; 
				}
				System.out.println("최고점수 : " + max);
				
				for (int i = 0; i < (price.length) - 1; i++) {
					if (min > price[i]) min = price[i]; 
				}
				System.out.println("최저점수 : " + min);
			


			} else if (selectNo == 5) {
				run = false;

			}
		}

		System.out.println("프로그램 종료");

	}

}