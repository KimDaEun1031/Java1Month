
public class Ex07_0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(i=0;i<10;i++) => while������ �ٲٱ�
		//�׸��� 1~10������ ���� while������ ���غ���
		
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		int num =1;
		int result=0;
		while(num<=10) {
			result += num;
			num++;
		}
		System.out.printf("1+2+3+4+5+6+7+8+9+10= %d",result);

	}

}
