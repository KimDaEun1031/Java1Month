package EX03;

import java.util.Scanner;

public class Ex03_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//�ý��� ���� ��Ŭ���� �ý��� ���� �ֿܼ� ������϶�  ǥ���Է���ġ
		int a, b = 0;
		String str;
	
		System.out.print("�Է����� ���� <1>10 <2>16 <3>8 : ");
		a = s.nextInt();
		
		System.out.print("�� �Է� : ");
		//if(a == 1) {
		//System.out.printf("10���� ==> %d \n" , b);
		//System.out.printf("16���� ==> %x \n" , b);
		//System.out.printf("8���� ==> %o" , b);    } 
	//���� �Ѱ� �̰ǵ� ������ ���� �غ��ô�.
		
		//���⿡  str = s.next(); �ϳ��� ����Ƶ� ��� ����ȴ� 
		if(a == 1) {
			str = s.next();//�Ʒ��� ���� ���� ���ٰ� ���� ���� �ƴϴ�.
			b = Integer.parseInt(str,10);//10������ ��������
			//�Է°��� 1�̸� 10������ �Է¹޴´�.   s.next�� ���ڿ��� �Է¹ް�      Integer...�� str�� 10������ ��ȯ�Ѵ�
		}
		else if(a==2) {
			str = s.next();
			b = Integer.parseInt(str,16);
		}
		else if(a==3) {
			str = s.next();
			b = Integer.parseInt(str,8);
		}
		System.out.printf("10���� ==> %d \n" , b);
		System.out.printf("16���� ==> %X \n" , b);//%x ó�� �ҹ��ڷ� �ϸ� �ҹ��ڷ� ����
		System.out.printf("8���� ==> %o" , b);    
		} 
}


