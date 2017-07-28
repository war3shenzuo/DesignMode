package FactoryMethod;

public class Main {
	public static void main(String[] args) {

		Factory factory = new BigFactory();
		Product product = factory.create("苹果");
		product.use();
		
	}
}
