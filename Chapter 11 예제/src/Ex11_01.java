
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
		Mycar1.color = "����";
		Mycar1.speed = 0;
		
		Car Mycar2 = new Car();
		Mycar2.color = "�Ķ�";
		Mycar2.speed = 0;
		
		Car Mycar3 = new Car();
		Mycar3.color = "���";
		Mycar3.speed = 0;
		
		Mycar1.upspeed(30);
		System.out.println("�ڵ��� 1�� ������ "+ Mycar1.color +"�̸�, ����ӵ��� "+Mycar1.speed +"'km'�Դϴ�");
		Mycar2.upspeed(60);
		System.out.println("�ڵ��� 2�� ������ "+ Mycar2.color +"�̸�, ����ӵ��� "+Mycar2.speed +"'km'�Դϴ�");
		Mycar3.upspeed(0);
		System.out.println("�ڵ��� 3�� ������ "+ Mycar3.color +"�̸�, ����ӵ��� "+Mycar3.speed +"'km'�Դϴ�");
		
	}

}
