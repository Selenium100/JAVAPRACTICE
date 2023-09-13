package javapracticeDemo;

public class Customer {
	String name;
	int age;
	static String comName="Amazon";
	public void sendMail() {
		System.out.println("send mail info");
	}
	public static void recieveMail() {
		System.out.println("recieve mail info");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.name="rinky";
		c.age=20;
	System.out.println(c.name+" "+c.age+" "+Customer.comName);	
		c.sendMail();
		
		

	}

}
