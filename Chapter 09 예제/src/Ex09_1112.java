import java.util.Scanner;

public class Ex09_1112 {
	
	
	public static int coffee_machine(int button) {
		
		System.out.printf("\n#1. (자동) 뜨거운 물을 준비한다.\n");
		System.out.printf("#2. (자동) 종이컵을 준비한다.\n");
		
		switch(button) {
		case 1: System.out.printf("#3. (자동) 보통커피를 탄다.\n"); break;
		case 2: System.out.printf("#3. (자동) 설탕커피를 탄다.\n"); break;
		case 3: System.out.printf("#3. (자동) 블랙커피를 탄다.\n"); break;
		default : System.out.printf("#3. (자동) 아무거나 탄다.\n"); break;
		}
		
		System.out.printf("#4. (자동) 물을 붓는다.\n");
		System.out.printf("#5. (자동) 스푼으로 저어서 녹인다.\n");
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("어떤 커피를 드릴까요? [1] 보통 [2] 설탕 [3] 블랙 [4] 아무거나 [5]필요없다.");
		int coffee; 
		do {
			coffee = s.nextInt();
			coffee_machine(coffee);
			System.out.printf("\n\n커피가 나왔습니다!");
		} while(coffee!=5); 
		
	}

}
