package hyq1913;

public class CarColorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarColor c1,c2,c3;
		for(CarColor c : CarColor.values()) {
			System.out.println(c + ":" + c.ordinal());
		}
		c1 = CarColor.RED;
		c2 = CarColor.BLACK;
		c3 = CarColor.RED;
		if(c1.compareTo(c2) <0) {
			System.out.println(c1 + "在" + c2 + "之前");
		}
		if(c3.equals(c1)) {
			System.out.println(c1 + "等于" + c3);
		}
		if(c1 == c3) {
			System.out.println(c1 + "==" + c3);
		}
	}

}

enum CarColor {
	RED(0),BLACK(1),WHITE(2);
	private int value;
	//在定义枚举类的构造函数时，不能定义public构造函数，最后一个枚举值末尾要用分号结束
	CarColor(int value) {
		this.value = value;
	}
	int getValue() {
		return value;
	}
	
	
}
