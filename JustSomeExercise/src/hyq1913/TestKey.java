package hyq1913;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class TestKey {

	public static void main(String[] args) {
		new KeyFrame().launchFrame();
	}
}

class KeyFrame extends Frame {
	public void launchFrame() {
		setBounds( 100, 100 , 500, 500 );
		setLayout(null);
		addKeyListener(new KeyAdapter() {
			
			private int count = 0;
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_UP) {
					System.out.println("You has pressed the up key!\n" + "-->" + ++count
							 + new Date());
				}
			}
			
		});
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				System.exit(0);
			}
			
		});
		setVisible(true);
	}
}
