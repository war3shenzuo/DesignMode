package Builder;

public class TuHao extends Builder {


	@Override
	public void morning() {
		System.out.println("开会议");
	}

	@Override
	public void afternoon() {
		System.out.println("打高尔夫");
	}

	@Override
	public void evening() {
		System.out.println("演唱会");
	}

	@Override
	public void sleep() {
		System.out.println("睡觉");
	}

}
