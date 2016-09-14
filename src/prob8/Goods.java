package prob8;

public class Goods {
	private String product;
	private int price;
	private int num;
	
	Goods(String product, int price, int num) {
		this.product = product;
		this.price = price;
		this.num = num;
	}
	
	void printProduct() {
		System.out.println(product + "(가격:" + price + "원)이 " + num + "개 입고 되었습니다.");
	}
}
