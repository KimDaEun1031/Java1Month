package EX03;



public class Ex03_07_01 {
//변수 그리고 자료형
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age = 500;
		 double temperature = 0.0;
		 
		 age = 100;
		 temperature = 123.45;
		 
		 System.out.printf("%d, %.2f", age, temperature);
		 //실수형에서 %7.1f 같은 앞에 7이 붙으면 소수점 7자리 중에서 1자리만 나오게 하라는 소리인데
		 //숫자말고 소수점만 붙인다면 %.1 / %.2 이런 식으로 한다면 소수점에서 몇자리까지 나오게 하냐라는 소리가 되기에 
		 // 소수점 자리 수만 변경되고 정수쪽은 띄어쓰기가 안됨

	}

}
