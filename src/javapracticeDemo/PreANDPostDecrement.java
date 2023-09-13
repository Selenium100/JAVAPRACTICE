package javapracticeDemo;

public class PreANDPostDecrement {

	public static void main(String[] args) {
		
//		  int i = 30; int j = i--; System.out.println(j);
		  
//		 int k = 15; int l = --k; System.out.println(k);
		 
//		 int x = 1; int t = x++ + ++x + x++ + ++x + ++x; System.out.println(x);
		 
		
		int x = 45;
		int y = --x + x-- + x-- + --x + --x;  // 44+44+43+41+40=212
		System.out.println(y);
		System.out.println(x);  //40

	}

}
