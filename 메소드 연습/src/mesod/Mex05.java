package mesod;

import javax.swing.JOptionPane;

public class Mex05 {

	public static void main(String[] args) {
		// ����ڷκ��� ���� �Է¹޾�, �����ȣ�� �˻�������.
		
		String address = "54321 ����� ���ʱ� ����1��,";
		address += "54322 ����� ���ʱ� ����2��,";
		address += "54323 ����� ���ʱ� ����3��,";
		address += "54324 ����� ���ʱ� ����4��,";
		address += "54325 ����� ���ʱ� ����5��,";
		
		String[] arAddress = address.split(",");
		
		String msg = "���� �Է��ϼ���.";
		String dong = "";
		
		int idx = -1;
		
		while(true) {
			dong = JOptionPane.showInputDialog(msg);
			
			for(int i=0;i<arAddress.length;i++) {
				if(arAddress[i].contains(dong)) {
					idx = i;
					break;
				}else {
					msg = "�ٽ� �Է��ϼ���.";
				}
			}
			if(idx != -1) {break;}
		}
		
		String post = arAddress[idx].substring(0,5);
		JOptionPane.showMessageDialog(null, post);

	}

}
