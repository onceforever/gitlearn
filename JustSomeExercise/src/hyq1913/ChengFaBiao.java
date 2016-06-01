package hyq1913;

public class ChengFaBiao {

	public static void main(String[] args) {
		chengFa();
	}
	
	public static void chengFa() {
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "  ");
			}
			System.out.println();
		}
	}

}
