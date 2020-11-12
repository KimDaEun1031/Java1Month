package wood_factory;
import java.util.Scanner;

public class Fuel { // 벌목기 사용할 때 들어가는 연료
	private int fuel;
	Scanner s = new Scanner(System.in);
	
	public int getFuel() {
		return fuel;
	}

	public void fuelLogging() {
		System.out.print("넣을 연료 개수 : ");
		fuel = s.nextInt();	
		this.fuel = fuel;
	}
}
