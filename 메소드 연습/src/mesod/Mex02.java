package mesod;

import javax.swing.JOptionPane;
//��ȭâ���� �Է��ϴ� �Լ�

public class Mex02 {

	public static void main(String[] args) {
		//����ڷκ��� �̸��� �Է¹��� �� ���� �̸��� �������� �и����Ѽ� �Է¹���
		String msg = "���� �̸��� �������� �и��Ͽ� �Է����ּ���.";
		
		String Firstname = "";
		String Lastname = "";
		
		while(true) {
			String name = JOptionPane.showInputDialog(msg);
		
		name = name.trim();
		
		if(name.contains(" ")) {
			int idx = name.indexOf(" ");
			
			Firstname = name.substring(0,idx);
			Lastname = name.substring(idx+1);
			break;			
		} else { 
			msg = "������ �����ϴ�. �ٽ� �Է����ּ���.";
		}
	}

		JOptionPane.showMessageDialog(null,"��:" + Firstname + "\n�̸�:" +Lastname);
		
	}

}
