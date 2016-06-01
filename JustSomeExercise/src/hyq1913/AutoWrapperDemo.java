package hyq1913;

public class AutoWrapperDemo {

	public static int func(Integer obj) {
		//在表达式中使用自动装箱/拆箱
		obj++;
		return obj;
	}
	
	public static void main(String[] args) {
		
		Integer iobj = 10;
		//在参数传递中自动装箱/拆箱
		System.out.println(func(iobj));
		//boolean类型自动装箱/拆箱
		boolean flag = true;
		if(flag) {
			System.out.println("flag is true");
		}
		//character类型自动装箱/拆箱
		Character ch = 'a';
		char c = ch;
		System.out.println(c);
	}
}
