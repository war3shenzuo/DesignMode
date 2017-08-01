package Prototype;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//生产
		Product p1 = manager.create("strong message");
		p1.use("Hello,World.");
		Product p2 = manager.create("warning box");
		p2.use("Hello,World.");
		Product p3 = manager.create("slash box");
		p3.use("Hello,World.");
		

	}

}
