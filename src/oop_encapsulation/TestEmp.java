package oop_encapsulation;

public class TestEmp {

//	public static void main(String[] args) {
//		Employee e1= new Employee();
//		e1.setName("Tom");
//		e1.setAge(20);
//		e1.setIsperm(true);
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Rinky", 20, true);
		System.out.println(e1.getName());
		System.out.println(e1.isIsperm());System.out.println(e1.getAge());
		
		e1.setAge(26);
		System.out.println(e1.getName());
		System.out.println(e1.isIsperm());System.out.println(e1.getAge());
		
	}

	}
	
	
	
	

	


