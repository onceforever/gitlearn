package hyq1913;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeCounter {

	static long normalLines = 0;
	static long commentLines = 0;
	static long whiteLines = 0;

	public static void main(String[] args) {
		File file = new File("D:/Eclipse/Workspace/MusicPlayer17/src/com/example/musicplayer17");
		File[] codeFiles = file.listFiles();
		for (File childFile : codeFiles) {

			if (childFile.getName().matches(".*\\.java$")) {
				parse(childFile);
			}

		}
		System.out.println("normalLines:" + normalLines);
		System.out.println("commentLines:" + commentLines);
		System.out.println("whiteLines:" + whiteLines);
	}

	private static void parse(File file) {
		BufferedReader br = null;
		boolean comment = false;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			try {
				while ((line = br.readLine()) != null) {
					line = line.trim();
					if (line.matches("^[\\s&&[^\\n]]*$")) { // readLine()方法本身就把\n去掉了
						whiteLines++;
					} else if (line.startsWith("/*") && !line.endsWith("*/")) {
						commentLines++;
						comment = true;
					} else if (line.startsWith("/*") && line.endsWith("*/")) {
						commentLines++;
					} else if (true == comment) {
						commentLines++;
						if (line.endsWith("*/")) {
							comment = false;
						}
					} else if (line.startsWith("//")) {
						commentLines++;
					} else {
						normalLines++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
