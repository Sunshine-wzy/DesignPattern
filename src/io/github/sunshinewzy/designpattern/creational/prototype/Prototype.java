package io.github.sunshinewzy.designpattern.creational.prototype;

public class Prototype {

	public static void main(String[] args) {
		try {
			Product productA1 = new Product(1, "A", new Info(123L, "Product A."));
			Product productA2 = productA1.clone();

			System.out.println(productA1);
			System.out.println(productA2);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
