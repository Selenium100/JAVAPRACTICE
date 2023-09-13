package javapracticeDemo;

public class EmployeeType {
	public void test() {
		System.out.println("my test method");
	}
	public EmployeeType() {
		System.out.println("constructer with zero parameter");
	}
	public EmployeeType(int i) {
		System.out.println("constructer with one parameter");
		
	}
	public EmployeeType(String a,int b) {
		System.out.println("constructer with two parameter");
		
	}

	public static void main(String[] args) {
		EmployeeType obj=new EmployeeType("Rinky",10);
		obj.test();
		
		
		
		

	}

}
