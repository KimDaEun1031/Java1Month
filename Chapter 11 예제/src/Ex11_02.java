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
		MyCar1.color = "����";
		MyCar1.speed = 0;
		
		MyCar1.upspeed(30);
		System.out.println("�ڵ��� 1�� ������ "+ MyCar1.color +"�̸�, ����ӵ��� "+MyCar1.speed +"'km'�Դϴ�");
		System.out.println("�ڵ��� 1�� ������ "+ MyCar1.getColor() +"�̸�, ����ӵ��� "+MyCar1.getSpeed() +"'km'�Դϴ�");

	}

}
