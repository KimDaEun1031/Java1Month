package wood_factory;
import java.util.Scanner;

public class Fuel { // ����� ����� �� ���� ����
	private int fuel;
	Scanner s = new Scanner(System.in);
	
	public int getFuel() {
		return fuel;
	}

	public void fuelLogging() {
		System.out.print("���� ���� ���� : ");
		fuel = s.nextInt();	
		this.fuel = fuel;
	}
}
