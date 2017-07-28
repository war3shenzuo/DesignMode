package FactoryMethod;

public abstract class Product {

	private String name;

	public Product(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("使用" + name + "产品");
	};

}
