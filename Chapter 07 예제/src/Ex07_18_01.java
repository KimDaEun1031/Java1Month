import java.util.Scanner;

public class Ex07_18_01 {
	//입력한 문자열의 대문자와 소문자, 숫자가 각각 몇개인지 세는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int ch_count1=0;
		int ch_count2=0;
		int number=0;
		
		System.out.printf("문자열을 입력하시오 : ");
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
		
		System.out.printf("대문자 %d개, 소문자%d개, 숫자%d개\n",ch_count1,ch_count2,number);
			
		}
	}


