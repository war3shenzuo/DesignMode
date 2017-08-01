package Builder;

public abstract class Builder {
	
	public void sleepbef(){
		System.out.println("洗脸刷牙");
		sleep();
	}

	public abstract void morning();

	public abstract void afternoon();

	public abstract void evening();

	protected abstract void sleep();

}
