package ArrayPractice;

public class ArraySort {

	public static void main(String[] args) {
		
		int arr[] = {2,1,5,3,4};
		
		int op[] = new int [arr.length];
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<=i-1;j++){
				if(arr[i]<arr[j]){
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr){
			System.out.println(i);
		}

	}

}
