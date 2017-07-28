package FactoryMethod;

public abstract class Factory {

	public abstract Product createProduct(String name);

	public abstract void registerProduct(Product product);

	public Product create(String name) {

		Product p = createProduct(name);

		registerProduct(p);

		return p;
	};

}
