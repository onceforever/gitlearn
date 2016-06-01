package hyq1913;

public class TestJDKClassLoader {

	public static void main(String[] args) {
		/*System.out.println(String.class.getClassLoader());
		System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());
		System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
		System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());    //��õľ���ApplicationClassLoader
*/		
		
		ClassLoader c = TestJDKClassLoader.class.getClassLoader();
		while (c != null) {
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
		
	}
}
