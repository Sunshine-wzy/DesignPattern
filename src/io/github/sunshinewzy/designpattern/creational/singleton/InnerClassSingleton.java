package io.github.sunshinewzy.designpattern.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class InnerClassSingleton implements Serializable {
	static final long serialVersionUID = 42L;
	
	private static class InnerClassHolder {
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	private InnerClassSingleton() { 
		if(InnerClassHolder.instance != null)
			throw new RuntimeException("Single instance does not allow multi instances.");
	}
	
	
	public static InnerClassSingleton getInstance() {
		return InnerClassHolder.instance;
	}
	
	
	Object readResolve() throws ObjectStreamException {
		return InnerClassHolder.instance;
	}
}

class InnerClassSingletonTest {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

		InnerClassSingleton instance = InnerClassSingleton.getInstance();

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialize.txt"));
//		oos.writeObject(instance);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialize.txt"));
		InnerClassSingleton object = ((InnerClassSingleton) ois.readObject());

		System.out.println(instance == object);

//		Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
//		declaredConstructor.setAccessible(true);
//		InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
//
//		InnerClassSingleton instance = InnerClassSingleton.getInstance();
//		System.out.println(innerClassSingleton == instance);

	}
}