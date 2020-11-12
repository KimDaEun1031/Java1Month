package abstractEx;

public abstract class Geometry {

	abstract double getArea();

	abstract double getRound(); // �߻� �޼ҵ带 �ϳ� �̻� ���� class�� �߻� Ŭ����.

	// class�� �߻�����!

}

   class Rect extends Geometry { // �簢���� ���������� ��ӹ���.

	// ������ �߻�class������ �ݵ�� Rect�� DohyungŬ������ �߻� �޼ҵ带

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

	public double getRound() { // ������ �ο�. getRound �̸��� Ʋ���� ������. ���� class Dohyung�� method�� �̸� ���ƾ���.

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
