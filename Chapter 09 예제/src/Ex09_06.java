import java.util.Scanner;

public class Ex09_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace(), substring(), split()
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���ڿ� �Է� : ");
		str = s.nextLine();
		
		System.out.println("[" + str + "]");
		String str1 = str.toUpperCase();
		System.out.println("[" + str1 + "]");
		String str2 = str.toLowerCase();
		System.out.println("[" + str2 + "]");
		String str3 = str.trim();
		System.out.println("[" + str3 + "]");
		
		//��� ���� ���ֺ���
		System.out.println();
		
		String result = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				result += str.substring(i,i+1);
			}
		}
		System.out.println("���ڿ� : "+str);
		System.out.println("�������� : "+result);
		
	}

}
