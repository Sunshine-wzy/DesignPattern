package io.github.sunshinewzy.designpattern.structural.facade;

public class Facade {
	private SubSystem1 subSystem1 = new SubSystem1();
	private SubSystem2 subSystem2 = new SubSystem2();
	private SubSystem3 subSystem3 = new SubSystem3();
	
	
	public void run() {
		subSystem1.method1();
		subSystem2.method2();
		subSystem3.method3();
	}
	
}


class Client {
	
	Facade facade = new Facade();
	
	public void run() {
		facade.run();
	}
	
}


class SubSystem1 {
	public void method1() {
		
	}
}

class SubSystem2 {
	public void method2() {
		
	}
}

class SubSystem3 {
	public void method3() {
		
	}
}