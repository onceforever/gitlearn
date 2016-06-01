package hyq1913;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestInnerClass {
	
	public static void main(String[] args) {
		TalkingClock tc = new TalkingClock(1000, true);
		tc.start();
		JOptionPane.showMessageDialog(null, "Quit program ?");
		System.exit(0);
		
	}	
}

class TalkingClock {
	
	private boolean beep;
	private int interval;
	
	public TalkingClock(int interval, boolean beep) {
		
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
			Date now = new Date();
			System.out.println("At the tone,the time is " + now);
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
}
