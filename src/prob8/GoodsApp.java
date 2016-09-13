package prob8;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Goods[] goods = new Goods[3];
		
		String str1 = scanner.nextLine();
		String[] str = str1.split(" ");
		System.out.println(str);
	}
}
