package javapracticeDemo;

public class TimeComplexity {

	public static void main(String[] args) {
// BigO
		int i=1;
//		O(n)
int p=2;
int total =i+p;
System.out.println(total);

    for (int k=1;k<=10;k++) {
    	System.out.println(k);
    }

	}

}
//=====>1+n+n+n===>1+3n===>3n+1====>linear equation
//3n+1====>3n====>O(n)