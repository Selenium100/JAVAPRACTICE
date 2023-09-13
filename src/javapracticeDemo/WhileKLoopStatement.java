package javapracticeDemo;

public class WhileKLoopStatement {

	public static void main(String[] args) {
		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			k++;
			if (k % 5 == 0) {
				System.out.println("hi...");
			}
			if (k == 50) {
				System.out.println("half century....");
				// break;
			}
			if (k == 100) {
				System.out.println("century....");
				// break;
			}
			
		}
	}

}
