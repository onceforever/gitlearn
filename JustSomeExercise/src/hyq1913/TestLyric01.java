package hyq1913;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLyric01 {

	public static void main(String[] args) {
		List<Lyric> lyricData = new ArrayList<Lyric>();
		lyricData = new TestLyric01()
				.getLyrics("E:/Music/Songs/Taylor Swift - Shake It Off.lrc");
		for (int i = 0; i < lyricData.size(); i++) {
			System.out.println(lyricData.get(i).begineTime
					+ ":" + lyricData.get(i).lrcContent);
		}
	}

	public static List<Lyric> getLyrics(String path) {
		List<Lyric> lyricList = new ArrayList<Lyric>();
		File file = new File(path);
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"GB2312"));
			String line = "";
			Pattern pattern = Pattern.compile("\\[\\d{2}:\\d{2}\\.\\d{2}\\].*");
			while ((line = br.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);
				if (matcher.matches()) {
					line = line.replace("[", "").replace("]", "@");
					if (line.endsWith("@")) {
						String[] lyricData = line.replace(":", ".")
								.replace(".", "@").split("@");
						if (lyricData.length == 3) {
							int m = Integer.parseInt(lyricData[0]);
							int s = Integer.parseInt(lyricData[1]);
							int ms = Integer.parseInt(lyricData[2]);
							int currentTime = (m * 60 + s) * 1000 + ms * 10;
							Lyric temp = new Lyric();
							temp.begineTime = currentTime;
							temp.lrcContent = "";
							lyricList.add(temp);
						}
					} else {
						String[] lyricData = line.split("@");
						String lrc = lyricData[lyricData.length - 1];
						String[] timeData = lyricData[0].replace(":", ".")
								.replace(".", "@").split("@");
						if (timeData.length == 3) {
							int m = Integer.parseInt(timeData[0]);
							int s = Integer.parseInt(timeData[1]);
							int ms = Integer.parseInt(timeData[2]);
							int currentTime = (m * 60 + s) * 1000 + ms * 10;
							Lyric temp = new Lyric();
							temp.begineTime = currentTime;
							temp.lrcContent = lrc;
							lyricList.add(temp);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lyricList;
	}
	
	public void getLineTime() {
		
	}

}
