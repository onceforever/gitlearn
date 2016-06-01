package hyq1913;

import java.awt.*;
import java.awt.event.*;
public class TestTFFrameMath {
	public static void main(String[] args) {
		new TFFrame();
	}
}

class TFFrame extends Frame {
	TextField num1,num2,num3;
	public TFFrame () {
		num1 = new TextField();
		num2 = new TextField();
		Label plus = new Label("+");
		Button equals = new Button("=");
		num3 = new TextField();
		equals.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(num1);
		add(plus);
		add(num2);
		add(equals);
		add(num3);
		pack();
		setVisible(true);
	}
}

class MyMonitor implements ActionListener {

	TFFrame tf = null;			//���жԷ�����
	public MyMonitor(TFFrame tf) {     //���췽��û�з������ͣ������ǳ�ʼ��һ��������ڲ�״̬
		this.tf = tf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(tf.num1.getText());
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText(String.valueOf(n1 + n2));
	}
	
}
