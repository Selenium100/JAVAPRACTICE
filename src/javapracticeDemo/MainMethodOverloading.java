package javapracticeDemo;

public class MainMethodOverloading {

	public static void main(String[] args) {
System.out.println("hii....");
MainMethodOverloading.main();
MainMethodOverloading.main(10);
	}
	public static void main() {
		System.out.println("bye...");
	}
	public static void main(int i) {
		System.out.println("rinky....");
	}

}
