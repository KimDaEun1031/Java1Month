package test;

public class test2 {
	public static void main(String[] args) {
		  
		  int[] num = new int[30];
		  
		  for(int i = 0; i<num.length; i++) {
		   
		   num[i] = (int)(Math.random() * 10); // 0���� 9 ���� ���� ����
		   System.out.print(num[i] + ", ");
		  }System.out.println();
		  
		  // �迭�� ����ִ� ���ڵ��� ���� � ����ִ��� ī��Ʈ ����
		  int[] count = new int[10];
		  
		  for(int i = 0; i<num.length; i++) {
		   count[num[i]]++; // num[i] �� ���� count[i]���� ���� 0~9 
		  }
		  for(int i =0; i<count.length; i++) {
		   System.out.println(i + "�� : " + count[i]); // ī��Ʈ ����� ���� ����
		  }
	}
}
