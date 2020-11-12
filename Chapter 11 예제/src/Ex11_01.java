
class Car {
	String color;
	int speed;
	
	void upspeed(int value) {
		speed = speed + value;
	}
	
	void downspeed(int value) {
		speed = speed - value;
	}
}

public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Mycar1 = new Car();
		Mycar1.color = "빨강";
		Mycar1.speed = 0;
		
		Car Mycar2 = new Car();
		Mycar2.color = "파랑";
		Mycar2.speed = 0;
		
		Car Mycar3 = new Car();
		Mycar3.color = "노랑";
		Mycar3.speed = 0;
		
		Mycar1.upspeed(30);
		System.out.println("자동차 1의 색상은 "+ Mycar1.color +"이며, 현재속도는 "+Mycar1.speed +"'km'입니다");
		Mycar2.upspeed(60);
		System.out.println("자동차 2의 색상은 "+ Mycar2.color +"이며, 현재속도는 "+Mycar2.speed +"'km'입니다");
		Mycar3.upspeed(0);
		System.out.println("자동차 3의 색상은 "+ Mycar3.color +"이며, 현재속도는 "+Mycar3.speed +"'km'입니다");
		
	}

}
