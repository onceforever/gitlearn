package hyq1913;

import java.net.*;
import java.io.*;
public class TestUDPServer {
	public static void main(String[] args) throws Exception{
		byte buf[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		DatagramSocket ds = new DatagramSocket(1913);
		while(true) {
			ds.receive(dp);
			ByteArrayInputStream bis = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bis);
			System.out.println(dis.readLong());
			//System.out.println(new String(buf,0,dp.getLength()));
		}
	}
}