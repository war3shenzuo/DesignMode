package Builder;

public class Ditector {
	private Builder buidel;

	public Ditector(Builder buidel) {
		this.buidel = buidel;
	}
	
	public void construct(){
		buidel.morning();
		buidel.afternoon();
		buidel.evening();
		buidel.sleepbef();
	}

}
