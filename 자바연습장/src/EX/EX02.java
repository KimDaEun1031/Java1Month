package EX;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//65430원을 만들기 위한 화폐의 갯수를 구하시오
		int money = 65430;
		
		int a = money / 10000;
		money = money % 10000;
		
		int b = money / 1000;
		money = money % 1000;
		
		int c = money / 100;
		money = money % 100;
		
		int d = money / 10;
		money = money % 10;
		
		
		System.out.println("만원 =" + a);
		System.out.println("천원 =" + b);
		System.out.println("백원 =" + c);
		System.out.println("십원 =" + d);
	}

}
