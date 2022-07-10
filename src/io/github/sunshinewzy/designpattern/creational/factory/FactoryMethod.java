package io.github.sunshinewzy.designpattern.creational.factory;

public class FactoryMethod {

	public static void main(String[] args) {
		Application application = new ConcreteProductA();
		Product product = application.createProduct();
		
		if(product != null) {
			product.method1();
		}
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