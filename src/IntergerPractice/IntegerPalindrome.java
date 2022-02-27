package IntergerPractice;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		
		int input = sc.nextInt();
		int originalInput = input;
		int output = 0;
		
		while (input>0){
			
			int rem;
			rem = input%10;
			output = output*10+rem;
			input = input/10;
		}
		
		if(output == originalInput){
			
			System.out.println("num is palindrome");
		}
		else{
			
			System.out.println("num is not palindrome");
		}
		
		System.out.println("Reverse of num is : "+output);

	}

}
