package javapracticeDemo;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
//ArrayList With Generics	
//------------------------
	ArrayList<Integer> marklist=new ArrayList<Integer>();
	marklist.add(100);
	marklist.add(200);
	ArrayList<Double> bmilist=new ArrayList<Double>();
	bmilist.add(10.00);
	bmilist.add(20.00);
	ArrayList<String> empNameslist=new ArrayList<String>();
	empNameslist.add("rinky");
	empNameslist.add("nitya");
	empNameslist.add("kutu");
	empNameslist.add("10");
	System.out.println(empNameslist.size());
//	for loop
	for(int i=0;i<empNameslist.size();i++) {
		System.out.println(empNameslist.get(i));
		System.out.println("-------------");
//		foe Each loop
	for(String e:empNameslist) {
		System.out.println(e);
	System.out.println("-------------");
ArrayList<Object> empdata=new ArrayList<Object>();
empdata.add("rinky");
empdata.add(25);
empdata.add(12.33);	
empdata.add(true);		
empdata.add('f');
for(Object k:empdata) {
	System.out.println(k);
}
		
		
	}
		
	}
	}

}
