import java.util.Scanner;

public class Ex07_18_01 {
	//�Է��� ���ڿ��� �빮�ڿ� �ҹ���, ���ڰ� ���� ����� ���� ���α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int ch_count1=0;
		int ch_count2=0;
		int number=0;
		
		System.out.printf("���ڿ��� �Է��Ͻÿ� : ");
		str = s.nextLine();
		
		int i = 0;
		
		do {
			ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch_count1++;
			}
			if(ch>='a' && ch<='z') {
				ch_count2++;
			}
			if(ch>='0' && ch<='9') {
				number++;
			}
			i++;
		} while(i<str.length());
		
		System.out.printf("�빮�� %d��, �ҹ���%d��, ����%d��\n",ch_count1,ch_count2,number);
			
		}
	}


