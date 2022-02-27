package IntergerPractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter a num");
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int next = 0;
		if (num == 1){
			System.out.print(a+" ");
		} else if (num == 2 ){
			//System.out.print(a+" ");
			System.out.print(b+" ");
		}
		else{
			//System.out.print(a+" ");
			//System.out.print(b+" ");
			
		for(int i=2; i<num; i++){
			
			next = a + b;
			a = b;
			b = next;		
			//System.out.print(next+" ");
		}
		
		System.out.print(next+" "); // nth term
		
	}

}
}
