package Builder;

public class Main {

	public static void main(String[] args) {
		Builder b = new TuHao();
		Ditector ditector = new Ditector(b);
		ditector.construct();
		
		Builder b1 = new DiaoSi();
		Ditector ditector1 = new Ditector(b1);
		ditector1.construct();

	}

}
