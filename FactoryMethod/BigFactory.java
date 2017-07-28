package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class BigFactory  extends Factory{

	List<Product> products = new ArrayList<>();
	
	@Override
	public Product createProduct(String name) {
		System.out.println("创建"+name+"产品");
		return new Tv(name);
	}

	@Override
	public void registerProduct(Product product) {
		products.add(product);
	}

}
