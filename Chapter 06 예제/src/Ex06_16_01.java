import java.util.Scanner;

public class Ex06_16_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��Ͻÿ� : ");
		String ch = s.nextLine();
		
		
		System.out.printf("\n\n�Էµ� ���ڿ� ==> %s\n",ch);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		int leng = ch.length();
		int str;
		
		for(str = leng-1;str>=0;str--) {
			System.out.printf("%c",ch.charAt(str));
		}

	}

}
