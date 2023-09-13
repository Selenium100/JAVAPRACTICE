package javapracticeDemo;

public class Customers {
	String name;
	int age;
	String city;
	String phone;

	public Customers(String name) {
		this.name = name;
	}

	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Customers(String name, int age, String city, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

	public static void main(String[] args) {
		Customers obj = new Customers("rinky");
		System.out.println(obj.name);
		Customers obj1 = new Customers("kutu",10);
		System.out.println(obj1.name+" "+obj1.age);

		
		
		
		
		
	}

}
