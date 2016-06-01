package hyq1913;

public class ClassDemo {

	public static void main(String args[]) {
		//����forName()���������׳��쳣����Ҫ����try�ڲ�
		try{
			//���þ�̬����forName()����ַ�����Ӧ��Class����
			Class c1 = Class.forName("someTest.Student");
			//����һ�����󣬹������б���Ҫ�ṩ��Ӧ��Ĭ�Ϲ��캯��
			Object obj = c1.newInstance();
			//ͨ����.class����ȡClassʵ��
			System.out.println(Student.class);
			//ͨ������Ķ�������ȡClassʵ��
			System.out.println(obj.getClass().getName());
			if(obj.getClass() == Student.class) {
				System.out.println("The class is student class!");
			}
			//��ȡ��ǰClass����֮�����Class����
			Class superClass = c1.getSuperclass();
			Object obj2 = superClass.newInstance();
			System.out.println(obj2.getClass().getName());
			//������ȡ���׵�Class����
			Class furtherClass = superClass.getSuperclass();
			Object obj3 = furtherClass.newInstance();
			System.out.println(obj3.getClass().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
