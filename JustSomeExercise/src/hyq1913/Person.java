package hyq1913;

public class Person {
	
	String name;
	//如果使用Class的newInstance()构造对象，则需要提供默认构造方法
	 public Person() {
	 }
	 
	 public Person(String name) {
		 this.name = name;
	 }

}

class Student extends Person {
	
	int age;
	public Student() {
		
	}
	
	public Student(String name,int age) {
		super(name);
		this.age = age;
	}
}
