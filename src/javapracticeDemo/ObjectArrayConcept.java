package javapracticeDemo;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		Object emp[]= new Object[5];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]=12.33;
		emp[3]='m';
		emp[4]=true;
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("---------");
		for(Object e : emp) {
			System.out.println(e);
		
		if(e.equals("Tom")) {
			System.out.println(e+"  "+  "hiiii.....");
			
		}
//		double d[]=new double[2];
//		d[0]=19.66;
//		d[1]=67.88;
//		for(double e : d) {
//			System.out.println(e);	
//		}
	
	}

}
}