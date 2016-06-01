package hyq1913;

import java.awt.*;
import java.awt.event.*;

public class TestAnonymous {

	Frame f = new Frame("Test");
	Button b = new Button("Start");
	TextField tf = new TextField(10);

	public TestAnonymous() {
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(tf);
		b.addActionListener(new ActionListener() {
			private int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(e.getActionCommand() + "--->" + (++i));
			}
		});
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f.setVisible(false);
				System.exit(0);
			}

		});
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TestAnonymous();
	}
}
