package io.github.sunshinewzy.designpattern.creational.builder;

public class Builder2 {
	public static void main(String[] args) {
		Product2 product = new Product2.Builder()
				.productName("PC").companyName("SunST")
				.part1("1").part2("2").part3("3").part4("4")
				.build();
		System.out.println(product);
	}
}


class Product2 {
	private final String productName;
	private final String companyName;
	private final String part1;
	private final String part2;
	private final String part3;
	private final String part4;


	public Product2(String productName, String companyName, String part1, String part2, String part3, String part4) {
		this.productName = productName;
		this.companyName = companyName;
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
	}

	
	static class Builder {
		private String productName;
		private String companyName;
		private String part1;
		private String part2;
		private String part3;
		private String part4;
		
		public Builder productName(String productName) {
			this.productName = productName;
			return this;
		}

		public Builder companyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public Builder part1(String part1) {
			this.part1 = part1;
			return this;
		}

		public Builder part2(String part2) {
			this.part2 = part2;
			return this;
		}

		public Builder part3(String part3) {
			this.part3 = part3;
			return this;
		}

		public Builder part4(String part4) {
			this.part4 = part4;
			return this;
		}
		
		public Product2 build() {
			return new Product2(productName, companyName, part1, part2, part3, part4);
		}
	}
	
	
	@Override
	public String toString() {
		return "Product2{" +
				"productName='" + productName + '\'' +
				", companyName='" + companyName + '\'' +
				", part1='" + part1 + '\'' +
				", part2='" + part2 + '\'' +
				", part3='" + part3 + '\'' +
				", part4='" + part4 + '\'' +
				'}';
	}
}