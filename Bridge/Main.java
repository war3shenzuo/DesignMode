package Bridge;

public class Main {

	public static void main(String[] args) {
		Display display = new CountDisplay(new StringDisplayImpl("shixianjie"));
		display.display();
		
		CountDisplay display1 = new CountDisplay(new StringDisplayImpl("shitiancai"));
		display1.mutiDisplay(2);
		
		RandomDisplay display2 = new RandomDisplay(new StringDisplayImpl("shitiancai"));
		display2.randomDisplay(8);
	}


}
