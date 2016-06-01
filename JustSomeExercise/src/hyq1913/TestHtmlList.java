package hyq1913;

import java.io.File;
import java.io.FilenameFilter;

public class TestHtmlList {

	static int count = 0;
	public static void main(String[] args) {
		File file = new File("F:/Music/songs");
		if (file.exists() && file.isDirectory()) {
			String[] fileNames = file.list(new FilenameFilter() {
				
				public boolean accept(File dir, String name) {
					return (name.endsWith(".mp3"));
				}
			});
			for (String name : fileNames) {
				count++;
				System.out.println(name);
			}
		}
		System.out.println("一共" + count + "首本地音乐!");
	}
}
