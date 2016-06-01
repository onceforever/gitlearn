package hyq1913;

import java.awt.EventQueue;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NotHelloWorldApplet extends JApplet {

	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JLabel label = new JLabel("Not a hello ,World Apllet", SwingConstants.CENTER);
				add(label);
			}
		});
	}
}
