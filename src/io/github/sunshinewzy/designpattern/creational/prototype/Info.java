package io.github.sunshinewzy.designpattern.creational.prototype;

import java.io.Serializable;

class Info implements Cloneable, Serializable {

	private long uuid;
	private String description;


	public Info(long uuid, String description) {
		this.uuid = uuid;
		this.description = description;
	}


	@Override
	protected Info clone() throws CloneNotSupportedException {
		return (Info) super.clone();
	}

	public long getUuid() {
		return uuid;
	}

	public String getDescription() {
		return description;
	}
}
