import java.io.IOException;

public class Ex10_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Daeun";
		String input = "";
		int key;
		
		try {
			System.out.print("�̸� : ");
			while ((key = System.in.read()) != 13) {
				input += Character.toString((char)key);
			}
			if(username.equals(input)) {
				System.out.println(input + "�� �������!");
			} else {
				System.out.println(input + "�� ��ϵ� ���� �ƴմϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
