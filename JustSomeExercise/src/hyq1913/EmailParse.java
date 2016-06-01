package hyq1913;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailParse {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("F:/A/email.htm"));
			String line = "";
			try {
				while ((line = br.readLine()) != null) {
					parse(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void parse(String line) {
		Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
		Matcher m = p.matcher(line);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
