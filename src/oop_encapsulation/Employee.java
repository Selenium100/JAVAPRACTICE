package oop_encapsulation;
public class Employee {
	private String name;
	private int age;
	private boolean isperm;
	public Employee(String name, int age, boolean isperm) {
		super();
		this.name = name;
		this.age = age;
		this.isperm = isperm;
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isIsperm() {
		return isperm;
	}
	public void setIsperm(boolean isperm) {
		this.isperm = isperm;
	}
	
	
	
	
	
	
	
	

}
