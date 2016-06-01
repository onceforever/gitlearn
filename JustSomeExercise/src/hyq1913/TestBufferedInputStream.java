package hyq1913;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("F:/A/C.txt") );
			int result = 0;
			try {
				while ((result = bis.read()) != -1) {
					System.out.print((char)result);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
