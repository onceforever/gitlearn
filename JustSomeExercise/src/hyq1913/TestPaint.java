package hyq1913;

import java.awt.*;

public class TestPaint {
	public static void main(String[] args) {
		new MyFrame().launchFrame();
	}
}

class MyFrame extends Frame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
	}

	public void launchFrame() {
		setBounds(100,100,400,400);
		setVisible(true);
	}
	
	//��frame��Ҫ���ػ�ʱpaint�������Զ����ã�����ı�frame��Сʱ�����´�ʱ��
	public void paint(Graphics g) {  //���Խ�Graphics�����g������һ֧���ʡ�
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,30,30);
		g.setColor(Color.green);
		g.fillRect(80,80,40,40);
		g.drawLine(80,80,50,50);
		g.setColor(c);  //����֮���ԭ������ɫ���û�ȥ���ָ��ֳ�
	}
}