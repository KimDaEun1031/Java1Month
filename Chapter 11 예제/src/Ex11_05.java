class Car_f {
	private int speed = 0;
	
	public void upspeed(int value) {
		if(speed + value > 200) {
			speed=200;
		} else {
			speed+=value;
		}
		System.out.println("현재 속도 : " + getSpeed());
	}
	
	public void downspeed(int value) {
		if(speed - value < 0) {
			speed=0;
		} else {
			speed-=value;
		}
		System.out.println("현재 속도 : " + getSpeed());
	}
	
	public int getSpeed() {
		return speed;
	}
}
public class Ex11_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_f mycar1 = new Car_f();
		

		mycar1.upspeed(100);
		mycar1.upspeed(150);
		
		mycar1.downspeed(50);
		mycar1.downspeed(160);
	}

}
