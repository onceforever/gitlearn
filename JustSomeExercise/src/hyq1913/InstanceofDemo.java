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
		//��������Ҳ����ʹ��instanceof���Ƚ�
		if(str instanceof String[]) {
			System.out.println("true");
		}
	}
}
