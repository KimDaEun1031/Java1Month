
public class Ex10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa [] = new int [3];
		try {
			aa[2] = 100 /0; 
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열입니다.");
		} catch (ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		} finally {
			System.out.println("무조건 나오는 부분");// 오류가 발생하든 안하든 무조건 나옴
		}

	}

}
