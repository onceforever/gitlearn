package hyq1913;

public class AutoWrapperDemo {

	public static int func(Integer obj) {
		//�ڱ��ʽ��ʹ���Զ�װ��/����
		obj++;
		return obj;
	}
	
	public static void main(String[] args) {
		
		Integer iobj = 10;
		//�ڲ����������Զ�װ��/����
		System.out.println(func(iobj));
		//boolean�����Զ�װ��/����
		boolean flag = true;
		if(flag) {
			System.out.println("flag is true");
		}
		//character�����Զ�װ��/����
		Character ch = 'a';
		char c = ch;
		System.out.println(c);
	}
}
