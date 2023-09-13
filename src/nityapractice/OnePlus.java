package nityapractice;

import java.util.Arrays;

public class OnePlus {
	
	public static int[] onePlus(int[]arr) {
		
		int length = arr.length;
		for(int i=length-1;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}else {
				arr[i]=0;
			}
		}
		
		int[] newArr = new int[length+1];
		newArr[0]=1;
		return newArr;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,9,9};
		
		System.out.println(Arrays.toString(onePlus(arr)) );

	}

}
