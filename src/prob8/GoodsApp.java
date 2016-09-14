package prob8;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input1 = scanner.nextLine().split(" ");
		String[] input2 = scanner.nextLine().split(" ");
		String[] input3 = scanner.nextLine().split(" ");
		
		int a = Integer.parseInt(input1[1]);
		int b = Integer.parseInt(input1[2]);
		int c = Integer.parseInt(input2[1]);
		int d = Integer.parseInt(input2[2]);
		int e = Integer.parseInt(input3[1]);
		int f = Integer.parseInt(input3[2]);
		
		Goods[] goods = new Goods[3];		// 클래스 배열 3개 선언
		goods[0] = new Goods(input1[0], a, b);	// 객체 생성
		goods[1] = new Goods(input2[0], c, d);	// 객체 생성
		goods[2] = new Goods(input3[0], e, f);	// 객체 생성
		
		for(int i=0; i<goods.length; i++) {	
			goods[i].printProduct();
		}
	}
}
