import java.util.ArrayList;

public class programPractice {
	public static int[] getData() {
		int i[]= {1,2,3};
		return i;
	}
	
	public static ArrayList<Integer> getDataArraylist(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		return arr;
	}
	
	
                                                                                                
	public static void main(String[] args) {
		
		System.out.println(getDataArraylist());
	}

}
