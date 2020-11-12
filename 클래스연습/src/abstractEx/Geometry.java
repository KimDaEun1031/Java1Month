package abstractEx;

public abstract class Geometry {

	abstract double getArea();

	abstract double getRound(); // 추상 메소드를 하나 이상 가진 class는 추상 클래스.

	// class도 추상으로!

}

   class Rect extends Geometry { // 사각형은 도형임으로 상속받음.

	// 도형은 추상class임으로 반드시 Rect에 Dohyung클래스의 추상 메소드를

	int width;

	int height;

	public Rect(int width, int height) {

		this.width = width;

		this.height = height;

	}

	@Override

	public double getArea() {

		return width * height;

	}

	@Override

	public double getRound() { // 강제성 부여. getRound 이름이 틀리면 에러남. 상위 class Dohyung의 method와 이름 같아야함.

		return (width + height) * 2;

	}

}

    class Circle extends Geometry {

	int r;

	public Circle(int r) {

		this.r = r;

	}

	@Override

	public double getArea() {

		return Math.PI * Math.pow(r, 2);

	}

	@Override

	public double getRound() {

		return (2 * r * Math.PI);

	}

}
