import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu;
		
		//do while�� �� switch���� ����� �ڵ�
		do {
			System.out.print("\n\n�մ� �ֹ��Ͻðڽ��ϱ�?\n");
			System.out.printf("<1>ī��� <2>�Ƹ޸�ī�� <3> īǪġ�� <4> �ֹ��� ���߿� �ҰԿ�. ==> \n");
		
			
			menu = s.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.printf("\n����󶼸� �ֹ��ϼ̽��ϴ�.\n"); break;
			case 2 :
				System.out.printf("\n�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.\n"); break;
			case 3 :
				System.out.printf("\nīǪġ�븦 �ֹ��ϼ̽��ϴ�.\n"); break;
			case 4 :
				System.out.printf("\n�߸��ֹ��ϼ̽��ϴ�..\n"); break;
			default :
				System.out.printf("\n�ֹ��Ͻ� ���� ī���ͷ� ���ּ���.\n");
			}
			
		}while(menu!=4);
		
		
		//do while�� �� ��øif���� ����� �ڵ�     ctrl+/�� ����
//		do {
//			System.out.print("�մ� �ֹ��Ͻðڽ��ϱ�?\n");
//			System.out.printf("<1>ī��� <2>�Ƹ޸�ī�� <3> īǪġ�� <4> �ֹ��� ���߿� �ҰԿ�. ==> \n");
//		
//			
//			menu = s.nextInt();
//			
//			if(menu==1) {
//				System.out.printf("\n����󶼸� �ֹ��ϼ̽��ϴ�.\n");			
//			}else if (menu==2) {
//				System.out.printf("\n�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.\n");
//			}else if (menu==3) {
//				System.out.printf("\nīǪġ�븦 �ֹ��ϼ̽��ϴ�.\n");
//			}else if (menu==4) {
//				System.out.printf("\n�߸��ֹ��ϼ̽��ϴ�.\n");
//			}else {
//				System.out.printf("\n�ֹ��Ͻ� ���� ī���ͷ� ���ּ���.\n");
//			}
//			
//		}while(menu!=4);
		
	
	}

}
