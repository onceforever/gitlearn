package hyq1913;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.*;

public class MyMouseAdapter {
	public static void main(String[] args) {
		new MyFrame("drawing....");
	}
}

class MyFrame extends Frame {
	ArrayList<Point> points = null;

	MyFrame(String s) {
		super(s);
		points = new ArrayList<Point>();
		setLayout(null);
		setBounds(300, 300, 400, 300);
		setBackground(new Color(225, 225, 255));
		setVisible(true);
		this.addMouseListener(new Monitor());
		// addWindowListener(new WindowAdapter() { //匿名内部类
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // TODO Auto-generated method stub
		// setVisible(false);
		// System.exit(-1);
		// }
		//
		// });
		addWindowListener(new MyWindowAdapter());
	}

	public void paint(Graphics g) {
		Iterator<Point> i = points.iterator();
		while (i.hasNext()) {
			Point p = (Point) i.next();
			g.setColor(Color.blue);
			g.fillOval(p.x, p.y, 5, 5);
		}
	}

	public void addPoint(Point p) {
		points.add(p);
	}

	class Monitor extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			MyFrame f = (MyFrame) arg0.getSource();
			f.addPoint(new Point(arg0.getX(), arg0.getY()));
			f.repaint();
		}

	}

	class MyWindowAdapter extends WindowAdapter {  //内部类

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			// super.windowClosing(e);
			setVisible(false);
			System.exit(0); // 传 0 是正常退出，传-1是非正常退出
		}

	}
}
