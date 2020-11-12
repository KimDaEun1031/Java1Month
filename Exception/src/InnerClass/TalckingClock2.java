package InnerClass;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.management.timer.Timer;


public class TalckingClock2 {
	public void start(int interval, boolean beep) {
		class TimePrinter implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.out.println("½Ã°£Àº : " + );
				if(beep) {
					System.out.println("Beep");
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
