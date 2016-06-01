package hyq1913;

public class ClassDemo {

	public static void main(String args[]) {
		//调用forName()方法可能抛出异常，需要放在try内部
		try{
			//调用静态方法forName()获得字符串对应的Class对象
			Class c1 = Class.forName("someTest.Student");
			//构造一个对象，构造类中必须要提供相应的默认构造函数
			Object obj = c1.newInstance();
			//通过类.class，获取Class实例
			System.out.println(Student.class);
			//通过具体的对象来获取Class实例
			System.out.println(obj.getClass().getName());
			if(obj.getClass() == Student.class) {
				System.out.println("The class is student class!");
			}
			//获取当前Class对象之父类的Class对象
			Class superClass = c1.getSuperclass();
			Object obj2 = superClass.newInstance();
			System.out.println(obj2.getClass().getName());
			//继续获取弗雷德Class对象
			Class furtherClass = superClass.getSuperclass();
			Object obj3 = furtherClass.newInstance();
			System.out.println(obj3.getClass().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
