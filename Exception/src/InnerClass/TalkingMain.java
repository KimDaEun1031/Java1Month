package InnerClass;

import javax.swing.JOptionPane;

public class TalkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalckingClock clock = new TalckingClock(1000, true);
		clock.start();		
		
		JOptionPane.showMessageDialog(null, "Quit");
		System.exit(0);
	}

}
