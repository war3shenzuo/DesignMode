package Bridge;

import java.util.Random;

public class RandomDisplay extends Display {

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int count) {
		int r = new Random().nextInt(7);
		System.out.println("次数："+r);
		open();

		
		for (int i = 1; i <=r; i++) {
			print();
		}

		close();

	}

}
