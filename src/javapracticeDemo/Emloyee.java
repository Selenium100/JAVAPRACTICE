package javapracticeDemo;

public class Emloyee {
	public void test() {
		System.out.println("hi........");
	}
	public String getName() {
		System.out.println("get method name");
		String n="tom";
		return n;
	}
public int add() {
	int a=100;
	int b=200;
	int c=a+b;
	System.out.println("add method");
	return c;
}
public int sum(int x, int y) {
	System.out.println("sum method");
	int total = x + y;
	return total;
}

public int getmarks(String studentName) {
	System.out.println("getting student marks for:"   +studentName);
	int mark=-1;
	if(studentName.equals("tom")) {
//		return 90;
		 mark=90;

	}
	else if(studentName.equals("mom")) {
//		return 95;
		 mark=95;

	}
	else if(studentName.equals("kom")) {
//		return 80;
		 mark=80;

	}
	else{
	System.out.println("student name is not found...."  + studentName);
//	return -1;
	}
	return mark;
}

	public static void main(String[] args) {
		Emloyee e=new Emloyee();
		e.test();
     String name = e.getName();
     System.out.println(name);
     
     int k=e.add();
     System.out.println(k);
     
   int sum=  e.sum(10, 20);
   System.out.println(sum);
     
   int m=  e.getmarks("tom");
     System.out.println(m+5);
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
