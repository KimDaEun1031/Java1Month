import java.util.Scanner;

public class Ex09_1112 {
	
	
	public static int coffee_machine(int button) {
		
		System.out.printf("\n#1. (�ڵ�) �߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("#2. (�ڵ�) �������� �غ��Ѵ�.\n");
		
		switch(button) {
		case 1: System.out.printf("#3. (�ڵ�) ����Ŀ�Ǹ� ź��.\n"); break;
		case 2: System.out.printf("#3. (�ڵ�) ����Ŀ�Ǹ� ź��.\n"); break;
		case 3: System.out.printf("#3. (�ڵ�) ��Ŀ�Ǹ� ź��.\n"); break;
		default : System.out.printf("#3. (�ڵ�) �ƹ��ų� ź��.\n"); break;
		}
		
		System.out.printf("#4. (�ڵ�) ���� �״´�.\n");
		System.out.printf("#5. (�ڵ�) ��Ǭ���� ��� ���δ�.\n");
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("� Ŀ�Ǹ� �帱���? [1] ���� [2] ���� [3] �� [4] �ƹ��ų� [5]�ʿ����.");
		int coffee; 
		do {
			coffee = s.nextInt();
			coffee_machine(coffee);
			System.out.printf("\n\nĿ�ǰ� ���Խ��ϴ�!");
		} while(coffee!=5); 
		
	}

}
