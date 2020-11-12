class Car_tre {
	private String color;
	private int speed;
	
	//protected와 public을 넣어봐라 
	protected void upspeed(int value) {
		speed = speed + value;
	}
	
	protected void downspeed(int value) {
		speed = speed - value;
	}
	
	protected String getColor() {
		return color;
	}
	
	protected int getSpeed() {
		return speed;
	}
	
	protected void setColor(String color) {
		this.color = color;
	}
	
	protected void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class Ex11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_tre MyCar1 = new Car_tre();
		MyCar1.setColor("빨강");
		MyCar1.setSpeed(0);
		
		MyCar1.upspeed(30);
		System.out.println("자동차 1의 색상은 "+ MyCar1.getColor()+"이며, 현재속도는 "+MyCar1.getSpeed() +"'km'입니다");

	}

}
