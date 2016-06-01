package hyq1913;

import java.awt.*;
import java.awt.event.*;

public class TestPlus {
	public static void main(String[] args) {
		new TFFrame();
	}
}

class TFFrame extends Frame {
	TextField num1, num2, num3;

	public TFFrame() {
		num1 = new TextField();
		num2 = new TextField();
		Label plus = new Label("+");
		Button equals = new Button("=");
		num3 = new TextField();
		equals.addActionListener(new MyMonitor());
		setLayout(new FlowLayout());
		add(num1);
		add(plus);
		add(num2);
		add(equals);
		add(num3);
		pack();
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				System.exit(0);
			}
			
		});
	}

	//成员内部类可以直接访问外部类的成员变量和成员函数;成员内部类中不能定义静态变量
	private class MyMonitor implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(String.valueOf(n1 + n2));
		}
	}
}

// class MyMonitor implements ActionListener {
//
// TFFrame tf = null;
// public MyMonitor(TFFrame tf) {
// this.tf = tf;
// }
// @Override
// public void actionPerformed(ActionEvent e) {
// // TODO Auto-generated method stub
// int n1 = Integer.parseInt(tf.num1.getText());
// int n2 = Integer.parseInt(tf.num2.getText());
// tf.num3.setText(String.valueOf(n1 + n2));
// }
//
// }
