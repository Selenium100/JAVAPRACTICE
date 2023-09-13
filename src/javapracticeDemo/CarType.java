package javapracticeDemo;

public class CarType {
	String name;
	int price;
	String plateNumber;
	static int wheels=4;

	public static void main(String[] args) {
		CarType c1=new CarType();
		c1.name="BMW";
		c1.price=70;
		c1.plateNumber="obf088888";
		
		CarType c2=new CarType();
		c2.name="Audi";
		c2.price=80;
		c2.plateNumber="obf645435";
		
		CarType c3=new CarType();
		c3.name="Honda";
		c3.price=90;
		c3.plateNumber="obf453443";
		
		System.out.println(CarType.wheels);
		
 
	}

}
