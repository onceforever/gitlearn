package hyq1913;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestAnonymousInnerClass {

	public static void main(String[] args) {
		
		TalkingClock1 tc = new TalkingClock1();
		tc.start(1000, true);
		JOptionPane.showMessageDialog(null, "Quit program ?");
		System.exit(0);
	}
}

class TalkingClock1 {
	
	public void start(int interval, final boolean beep) {
		
		ActionListener listener = new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Date now = new Date();
				System.out.println("At the tone,the time is " + now);
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
