package model;

public abstract class Product implements ProductIF {

	private String name;
	private String code;
	private Double price;

	public Product(String name, String code, Double price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + "]";
	}			
}
