import java.util.Scanner;

public class Ex05_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5-9
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("1 ~ 4 Áß¿¡ ¼±ÅÃÇÏ¼¼¿ä! ");
		a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1À» ¼±ÅÃÇß´Ù.");
			break;
		case 2:
			System.out.println("2À» ¼±ÅÃÇß´Ù.");
			break;
		case 3:
			System.out.println("3À» ¼±ÅÃÇß´Ù.");
			break;
		case 4:
			System.out.println("4À» ¼±ÅÃÇß´Ù.");
			break;
		default :
			System.out.println("ÀÌ»óÇÑ °É ¼±ÅÃÇß´Ù!");
		}
		
		
		//5-10
		int year;
		
		System.out.print("Ãâ»ı¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		year = s.nextInt();
		
		switch (year % 12) {
		case 0 : System.out.println("¿ø¼şÀÌ¶ì"); break;
		case 1 : System.out.println("´ß¶ì"); break;
		case 2 : System.out.println("°³¶ì"); break;
		case 3 : System.out.println("µÅÁö¶ì"); break;
		case 4 : System.out.println("Áã¶ì"); break;
		case 5 : System.out.println("¼Ò¶ì"); break;
		case 6 : System.out.println("È£¶ûÀÌ¶ì"); break;		
		case 7 : System.out.println("Åä³¢¶ì"); break;
		case 8 : System.out.println("¿ë¶ì"); break;
		case 9 : System.out.println("¹ì¶ì"); break;
		case 10 : System.out.println("¸»¶ì"); break;
		case 11 : System.out.println("¾ç¶ì"); break;
		
		}
		

	}

}
