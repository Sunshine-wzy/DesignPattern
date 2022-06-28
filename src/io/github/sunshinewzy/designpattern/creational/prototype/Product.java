package io.github.sunshinewzy.designpattern.creational.prototype;

import java.io.*;

class Product implements Cloneable, Serializable {

	private int id;
	private String name;
	private Info info;


	public Product(int id, String name, Info info) {
		this.id = id;
		this.name = name;
		this.info = info;
	}

	@Override
	protected Product clone() throws CloneNotSupportedException {
//		Product product = (Product) super.clone();
//		product.info = this.info.clone();
//		return product;

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
			oos.writeObject(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		
		try {
			ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
			return (Product) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Info getInfo() {
		return info;
	}
}