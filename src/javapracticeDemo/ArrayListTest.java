package javapracticeDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListTest {

	public static void main(String[] args) {
   ArrayList<Integer>marklist=new ArrayList<Integer>();
   marklist.add(190);
   marklist.add(1290);
   marklist.add(390);
   marklist.add(690);
   Collections.sort(marklist);
   System.out.println(marklist);
   System.out.println("min value"  + marklist.get(0));
   System.out.println("max value"  + marklist.get(marklist.size()-1));
Collections.sort(marklist,Collections.reverseOrder());
   ArrayList<Integer>marklist1=new ArrayList<Integer>();
   marklist1.add(590);
   marklist1.add(290);
   marklist1.add(790);
   marklist1.add(890);
   marklist1.addAll(marklist);
   System.out.println(marklist1);
//  collection.short()to write in shorted order 
// collection.swap(names 1 2)to interchange  
// variable.clear()to clear d data
//   variable.contains("x")to see the data is present or not
// system.gc();to destroy all no refferece object and null pointer objects  
   
   
   
   
//int numberlist[] = { 190,1290,390,690}; 
//System.out.println(Arrays.toString(numberlist));
   
   
   
   
   
   
   
   
   
   
   
	}

}
