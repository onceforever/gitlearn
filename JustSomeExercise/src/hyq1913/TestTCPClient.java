package hyq1913;

import java.net.*;
import java.io.*;

public class TestTCPClient {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",123);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Thread.sleep(3000);
		dos.writeUTF("Hello ZhangHang!");
		dos.close();
		s.close();
	}
}