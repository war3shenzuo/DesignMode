package TemplateMethod;

public abstract class AbstractDisplay {

	public abstract void open();

	public abstract void run();

	public abstract void close();

	public void Display() {

		this.open();

		for (int i = 0; i < 2; i++) {
			run();
		}
		close();

	}

}
