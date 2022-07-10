package io.github.sunshinewzy.designpattern.creational.factory;

class SimpleFactory {
	public static Product createProduct(String type) {
		if(type == null) return null;

		if(type.equals("A")) {
			return new ProductA();
		} else if(type.equals("B")) {
			return new ProductB();
		} else return null;
	}
}

class SimpleFactoryTest {

	public static void main(String[] args) {
		Product product = SimpleFactory.createProduct("A");
		
		if(product != null) {
			product.method1();
		}
	}
	
}