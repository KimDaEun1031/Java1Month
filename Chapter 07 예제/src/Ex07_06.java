import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu;
		
		//do while문 과 switch문을 사용한 코드
		do {
			System.out.print("\n\n손님 주문하시겠습니까?\n");
			System.out.printf("<1>카페라떼 <2>아메리카노 <3> 카푸치노 <4> 주문은 나중에 할게요. ==> \n");
		
			
			menu = s.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.printf("\n까페라떼를 주문하셨습니다.\n"); break;
			case 2 :
				System.out.printf("\n아메리카노를 주문하셨습니다.\n"); break;
			case 3 :
				System.out.printf("\n카푸치노를 주문하셨습니다.\n"); break;
			case 4 :
				System.out.printf("\n잘못주문하셨습니다..\n"); break;
			default :
				System.out.printf("\n주문하실 때는 카운터로 와주세요.\n");
			}
			
		}while(menu!=4);
		
		
		//do while문 과 중첩if문을 사용한 코드     ctrl+/로 해제
//		do {
//			System.out.print("손님 주문하시겠습니까?\n");
//			System.out.printf("<1>카페라떼 <2>아메리카노 <3> 카푸치노 <4> 주문은 나중에 할게요. ==> \n");
//		
//			
//			menu = s.nextInt();
//			
//			if(menu==1) {
//				System.out.printf("\n까페라떼를 주문하셨습니다.\n");			
//			}else if (menu==2) {
//				System.out.printf("\n아메리카노를 주문하셨습니다.\n");
//			}else if (menu==3) {
//				System.out.printf("\n카푸치노를 주문하셨습니다.\n");
//			}else if (menu==4) {
//				System.out.printf("\n잘못주문하셨습니다.\n");
//			}else {
//				System.out.printf("\n주문하실 때는 카운터로 와주세요.\n");
//			}
//			
//		}while(menu!=4);
		
	
	}

}
