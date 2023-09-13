package javapracticeDemo;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a <= b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("--------------------------------------------");
		
		
		int total = 29;
		if (total >= 30) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}

		if (total >= 90) {
			System.out.println("pass with A GRADE");
		} else {
			System.out.println("B GRADE");
		}

		
	}
}
