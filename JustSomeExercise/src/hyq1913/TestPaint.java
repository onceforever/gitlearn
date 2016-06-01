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
	
	//当frame需要被重画时paint方法会自动调用，例如改变frame大小时，重新打开时等
	public void paint(Graphics g) {  //可以将Graphics类对象g当做是一支画笔。
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,30,30);
		g.setColor(Color.green);
		g.fillRect(80,80,40,40);
		g.drawLine(80,80,50,50);
		g.setColor(c);  //用完之后把原来的颜色设置回去，恢复现场
	}
}