package io.github.sunshinewzy.designpattern.creational.singleton;

public class LazySingleton {
	private static volatile LazySingleton instance;
	
	private LazySingleton() {
		
	}
	
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			
			synchronized(LazySingleton.class) {
				if(instance == null)
					instance = new LazySingleton();
			}
			
		}
		
		return instance;
	}
	 
}

class LazySingletonTest {
	public static void main(String[] args) {
		
		new Thread(() -> {
			LazySingleton ins1 = LazySingleton.getInstance();
			System.out.println(ins1);
		}).start();

		new Thread(() -> {
			LazySingleton ins2 = LazySingleton.getInstance();
			System.out.println(ins2);
		}).start();

	}
}
