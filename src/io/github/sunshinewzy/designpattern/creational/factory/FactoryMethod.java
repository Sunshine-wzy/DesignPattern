package io.github.sunshinewzy.designpattern.creational.factory;

public class FactoryMethod {

	public static void main(String[] args) {
		Application application = new ConcreteProductA();
		Product product = application.createProduct();
		
		// 简单工厂
//		Product product = SimpleFactory.createProduct("A");
		
		if(product != null) {
			product.method1();
		}
	}
	
}

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

interface Product {
	void method1();
}

class ProductA implements Product {
	@Override
	public void method1() {
		System.out.println("A");
	}
}

class ProductB implements Product {
	@Override
	public void method1() {
		System.out.println("B");
	}
}


abstract class Application {
	abstract Product createProduct();
}

class ConcreteProductA extends Application {
	@Override
	Product createProduct() {
		return new ProductA();
	}
}

class ConcreteProductB extends Application {
	@Override
	Product createProduct() {
		return new ProductB();
	}
}