package hyq1913;

public class InstanceofDemo {

	public static void typeof(Object obj) {
		if(obj instanceof Student) {
			System.out.println("Student!");
		}
		if(obj instanceof Person) {
			System.out.println("Person!");
		}
	}
	
	public static void main(String[] args) {
		Person obj1 = new Person("Tom"); 
		Student obj2 = new Student("Jack",23);
		typeof(obj2);
		typeof(obj1);
		String str[] = new String[3];
		//数组类型也可以使用instanceof来比较
		if(str instanceof String[]) {
			System.out.println("true");
		}
	}
}
