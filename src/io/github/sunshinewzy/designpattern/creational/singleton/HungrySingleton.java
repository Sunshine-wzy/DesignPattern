package io.github.sunshinewzy.designpattern.creational.singleton;

public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();
	private HungrySingleton() { }
	
	public static HungrySingleton getInstance() {
		return instance;
	}
	
}


class HungrySingletonTest {
	public static void main(String[] args) {
		HungrySingleton ins1 = HungrySingleton.getInstance();
		HungrySingleton ins2 = HungrySingleton.getInstance();

		System.out.println(ins1 == ins2);
	}
}