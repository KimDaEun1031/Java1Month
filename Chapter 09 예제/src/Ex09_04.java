import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexOf(), lastIndexOf()
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���ڿ� �Է� : ");
		str = s.nextLine();
		
		System.out.printf("���� ó�� ������ java ��ġ : ");
		System.out.println(str.indexOf("Java"));
		System.out.printf("���� ���߿� ������ java ��ġ : ");
		System.out.println(str.lastIndexOf("Java"));
		
	}

}
