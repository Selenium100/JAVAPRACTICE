import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindAllNumbersDisappearedInArray {

	
	public static int[] disNumbers(int[] arr) {
		Arrays.sort(arr);
		HashSet<Integer> hs =new HashSet<Integer>();
		for(Integer each:arr) {
			hs.add(each);
		}
		for(int i=0;i<hs.size();i++) {
			
		}
		return null;
		
		
		 
		
		
		
		
	}
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(disNumbers(arr)));

	}

}
