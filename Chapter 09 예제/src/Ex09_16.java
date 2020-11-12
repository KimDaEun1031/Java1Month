
public class Ex09_16 {
	static void func1() {
		System.out.printf("보이드형 메소드는 돌려줄게 없음\n");
		
	}
	static int func2() {
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		func1();
		a = func2();
		System.out.printf("int 형 메소드에서 돌려준 값 : %d\n",a);

	}

}
