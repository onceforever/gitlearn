package hyq1913;

public class Person {
	
	String name;
	//���ʹ��Class��newInstance()�����������Ҫ�ṩĬ�Ϲ��췽��
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
