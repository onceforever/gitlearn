package hyq1913;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestMusicDirectory {

	//private static final String PATH = "F:/Music/Songs";
	private static final String PATH = "F:/";
	
	public static void main(String[] args) {
		DataSource ds = new DataSource();
		ds.getAudioList(PATH);
		for (int i = 0;i < ds.audioList.size();i++) {
			String s = ds.audioList.get(i);
			String[] strName = s.split("/");
			System.out.println(strName[strName.length - 1]);
		}
		System.out.println("一共有" + ds.audioList.size() + "首本地音乐");
	}
}

class GetDataSource {

	private static final String FORMAT = ".mp3";
	List<String> audioList = null;

	public GetDataSource() {
	}
	
	public static boolean isAudioFile(String path) {
		if (path.endsWith(FORMAT)) {
			return true;
		}
		return false;
	}
	
	public List<String> getAudioList(String path) {
		getFiles(path);
		return audioList;

	}

	public void getFiles(String path) {
		audioList = new ArrayList<String>();
		File file = new File(path);
		File[] files = file.listFiles();
		try {
			for (File f : files) {
				if (f.isDirectory()) {
					getFiles(f.getAbsolutePath());
				} else {
					if (isAudioFile(f.getPath())) {
						audioList.add(f.getPath());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}