package mesod;

import javax.swing.JOptionPane;

public class Mex05 {

	public static void main(String[] args) {
		// 사용자로부터 동을 입력받아, 우편번호를 검색해주자.
		
		String address = "54321 서울시 서초구 서초1동,";
		address += "54322 서울시 서초구 서초2동,";
		address += "54323 서울시 서초구 서초3동,";
		address += "54324 서울시 서초구 서초4동,";
		address += "54325 서울시 서초구 서초5동,";
		
		String[] arAddress = address.split(",");
		
		String msg = "동을 입력하세요.";
		String dong = "";
		
		int idx = -1;
		
		while(true) {
			dong = JOptionPane.showInputDialog(msg);
			
			for(int i=0;i<arAddress.length;i++) {
				if(arAddress[i].contains(dong)) {
					idx = i;
					break;
				}else {
					msg = "다시 입력하세요.";
				}
			}
			if(idx != -1) {break;}
		}
		
		String post = arAddress[idx].substring(0,5);
		JOptionPane.showMessageDialog(null, post);

	}

}
