class Mychar {
	char x;
	char y;
}
public class Ex09_19 {
	static void fuc1(char x, char y) {
		char imsi;
		imsi = x;
		x = y;
		y = imsi;		
	}
	
	static void fuc2(Mychar ch) {
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'A',y = 'Z';
		System.out.printf("원래 값 : x = %c, y = %c\n",x,y);
		fuc1(x,y);
		System.out.printf("값을 전달한 후 : x = %c, y = %c\n\n",x,y);
		
		Mychar ch = new Mychar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값 : x = %c, y = %c\n",ch.x,ch.y);
		fuc2(ch);
		System.out.printf("값을 전달한 후 : x = %c, y = %c\n\n",ch.x,ch.y);
		
	}

}
