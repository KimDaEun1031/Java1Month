class Car_One {
	String color;
	int speed;
	
	void upspeed(int value) {
		speed = speed + value;
	}
	
	void downspeed(int value) {
		speed = speed - value;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
}


public class Ex11_02 {

	public static void main(String[] args) {

		Car_One MyCar1 = new Car_One();
		MyCar1.color = "빨강";
		MyCar1.speed = 0;
		
		MyCar1.upspeed(30);
		System.out.println("자동차 1의 색상은 "+ MyCar1.color +"이며, 현재속도는 "+MyCar1.speed +"'km'입니다");
		System.out.println("자동차 1의 색상은 "+ MyCar1.getColor() +"이며, 현재속도는 "+MyCar1.getSpeed() +"'km'입니다");

	}

}
