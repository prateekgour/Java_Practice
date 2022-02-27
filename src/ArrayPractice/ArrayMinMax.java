package ArrayPractice;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int input[] = {2,1,5,3,4};
		int max = input[0];
		
		for(int i=1; i<input.length; i++){
		
		if (max<input[i]){
			
			max = input[i];
		}
		}
		System.out.println(max);
		}
		
		/////////////////////////////////////////////////////////////////
		
		/*Arrays.sort(arr);
		
		min = arr[0];
		max = arr[arr.length-1];
		System.out.println("min :" + min);
		System.out.println("max :" + max); */
	
	

}
