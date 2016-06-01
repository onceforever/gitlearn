package hyq1913;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestActionEvent {
	public static void main(String[] args) {
		Frame f = new Frame("Test");
		Button b = new Button("Press me!");
		Monitor m = new Monitor();
		b.addActionListener(m);
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}
class Monitor implements ActionListener {
	static int count = 1;
	public void actionPerformed(ActionEvent e) {
		System.out.println("a button has been pressed !----->" + count++ + "---->" + new Date());
	}
}