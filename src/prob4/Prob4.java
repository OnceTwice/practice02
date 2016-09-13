package prob4;

import java.util.Scanner;

public class Prob4 {//
	public static void main(String[] args) {
		/* 구현코드 */
		int[] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] num = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i] + "만원 : " + money / array[i]);
			money -= array[i]*(money/array[i]);
		}
		
	}
}

