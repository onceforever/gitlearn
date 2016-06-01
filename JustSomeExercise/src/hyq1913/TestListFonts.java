package hyq1913;

import java.awt.GraphicsEnvironment;

public class TestListFonts {

	public static void main(String[] args) {
		int i = 0;
		String[] fontNames = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String name : fontNames) {
			System.out.println(++i + ": " +name);
		}
	}
}
