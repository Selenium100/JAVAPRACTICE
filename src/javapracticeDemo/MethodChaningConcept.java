package javapracticeDemo;

public class MethodChaningConcept {
	 public int totalBillCount(int userCount) {
		 int tax=100;
		 int bill=1000;
		 int totalbill=(tax+bill)*userCount;
		 return totalbill;
		
	}
	 public void m1(int p) {
		m2(p); 
	 }
	 public void m2(int k) {
		m3(k); 
	 }
	 public void m3(int i) {
		System.out.println("bye"  +i); 
	 }

	 
	public static void main(String[] args) {
		MethodChaningConcept obj=new MethodChaningConcept();
	int sum=obj.totalBillCount(10);
		System.out.println(sum);
		obj.m3(10);

	}

}
