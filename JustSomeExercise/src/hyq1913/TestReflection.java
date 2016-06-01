package hyq1913;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String str = "T";
		Class c = Class.forName(str);    //装在指定类
		Object o = c.newInstance();
		Method[] methods = c.getMethods();
		for (Method m : methods) {
			if (m.getName().equals("mm")) {
				m.invoke(o);
			}
		}
	}
}

class T {
	static {
		System.out.println("loaded!");
	}
	
	int i;
	String s;
	
	public T() {
		System.out.println("Constructor!");
	}
	
	public void mm() {
		System.out.println("m invoked!");
	}
	
	public void m1(int i) {
		this.i = i;
	}
	
	public String getS() {
		return s;
	}
}