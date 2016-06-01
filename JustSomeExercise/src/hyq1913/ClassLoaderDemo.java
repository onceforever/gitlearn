package hyq1913;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassLoader classLoader = null;
		// 获取系统默认的ClassLoader
		classLoader = ClassLoader.getSystemClassLoader();
		System.out.println(classLoader);
		while (classLoader != null) {
			// 取得父的ClassLoader
			classLoader = classLoader.getParent();
			System.out.println(classLoader);
		}
		try {
			Class c1 = Class.forName("java.lang.Object");
			classLoader = c1.getClassLoader();
			System.out.println("java.lang.Object's loader is " + classLoader);
			c1 = Class.forName("someTest.ClassLoaderDemo");
			classLoader = c1.getClassLoader();
			System.out.println("sometest.ClassLoaderDemo's loader is "
					+ classLoader);
		} catch (Exception e) {
			System.out.println("Check name of the class!");
		}
	}

}
