package hyq1913;

import java.net.*;
import java.io.*;
public class TestTCPServer {
	public static void main(String[] args) throws Exception {
		int count = 0;
		ServerSocket ss = new ServerSocket(123);
		while(true) {
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF() + "------>" + ++count);
			dis.close();
			s.close();
		}
	}
}