package mesod;

import javax.swing.JOptionPane;
//대화창에서 입력하는 함수

public class Mex02 {

	public static void main(String[] args) {
		//사용자로부터 이름을 입력받을 때 성과 이름을 공백으로 분리시켜서 입력받자
		String msg = "성과 이름을 공백으로 분리하여 입력해주세요.";
		
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
			msg = "공백이 없습니다. 다시 입력해주세요.";
		}
	}

		JOptionPane.showMessageDialog(null,"성:" + Firstname + "\n이름:" +Lastname);
		
	}

}
