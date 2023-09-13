package javapracticeDemo;

public class ForEachloopConcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20; 
		i[2] = 30; 
		i[3] = 40;	
	for(int k=0;k<i.length;k++) {
		System.out.println(i[k]);//index based for loop
	}
	System.out.println("-----------");
//	for each loop
	for(int e :i) {
		System.out.println(e);
		
	}
		
		
		
		
		
	}

}
