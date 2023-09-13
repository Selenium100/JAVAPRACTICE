package javapracticeDemo;

public class Ecomm {
	public void test() {
		System.out.println("this is my test method");

	}

	public int test(int i) {

		System.out.println("hiiii");
		return 10 + i;
	}

	public void test(String k) {

	}

	public void test(int i, String k) {

	}

	public void test(String p, int g) {

	}

//
	public static void main(String[] args) {
		Ecomm obj = new Ecomm();
		obj.test();
		int sum = obj.test(20);
		System.out.println(sum);

	}

}
