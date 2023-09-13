package javapracticeDemo;

public class ArrayLiterals {

	public static void main(String[] args) {
int i[]= {10,20,30,40};
System.out.println(i.length);
System.out.println("hi="  +(i.length-1));
System.out.println("li="  +0);
System.out.println("--------");
for(int e: i){
	System.out.println(e);
}
// string array literals
//------------------------
String students[] = {"rinky","lipu","bapun","munna"};
System.out.println(students.length);
for(String e: students) {
	System.out.println(e);
	if(e.equals("rinky")) {
		System.out.println("100 marks.....");
		
	}
	System.out.println("-----------");
//	object array literals
//	------------------------
	Object obj[]= {"rinky",25,21.44,true,'f'};
	for(Object p:obj) {
		System.out.println(p);
		
	}
}



	}

}
