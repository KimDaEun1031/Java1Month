package EX;
//����, �y��, ����, ������ �� �ϳ��� �����Ͽ� ����ϴ� ���α׷��� if���� Ȱ���Ͽ� ������
import java.util.Scanner;

public class Ex02_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b, c, result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ�. ==> ");
		a = s.nextInt();
		System.out.print("<1>���� <2> ���� <3> ���� <4> ������  ==> ");
		c = s.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�. ==> ");
		b = s.nextInt();
		if(c == 1) {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
			}
		else if(c == 2) {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
			}
		else if(c == 3) {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
			}
		else if(c == 4) {
			result = a/b;
			System.out.println(a + "/" + b + "=" + result);
			}
		
		//�� �Ŀ� else�� �־ �߸� �ԷµǾ��� ���� �κ��� �ϴϱ� Ʈ�翩�� �߸��Էºκ��� ��������
		// �̰� ���� if�� �� �ڼ��ϰ� ���� �˶�? ���� ���������� �ֿ����� ���� �߸� �Է����� ���� ������ ������
		// ����ôµ� ���� �𸣰ڳ� / ����ũ����Ʈ ������ �� �� �غ���?
	}

}
