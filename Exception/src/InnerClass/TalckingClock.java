package InnerClass;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.Timer;



public class TalckingClock {
	private int interval;
	private boolean beep;
	
	public TalckingClock(int interval, boolean beep) {
		
	}
	public void start() {
		ActionListener listener = new TimePrinter();
		t.start();
	}
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is " + new.Date() );
		if(beep) {
			Toolkit.getDefaultToolkit().beep();
		}
	}
}
