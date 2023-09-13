package javapracticeDemo;

public class StaticMethodOverloading {
	public static void printLogo() {

	}

	public static void printLogo(int a, int b) {

	}

	public static String printLogo(String name) {
return name+ "logo";
	}

	public static void main(String[] args) {
		
		
	String n=StaticMethodOverloading.printLogo("rinky");
		System.out.println(n);

	}

}
