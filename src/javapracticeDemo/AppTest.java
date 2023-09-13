package javapracticeDemo;

public class AppTest {

	public static void main(String[] args) {
		ApplicationSystem app1=new ApplicationSystem("Amazon", 10, "https://www.amazon.com");
		
		int c=app1.getPageCount(app1.name);
		System.out.println(c);
		
		
		

	}

}
