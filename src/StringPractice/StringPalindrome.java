package StringPractice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner s;
		int choice = 0;
		String str = "";
		do{
			System.out.println("Enter a string");
			s = new Scanner(System.in);
			str = s.nextLine();
			isPalindrome(str);
			
			System.out.println("Enter 1 to check another string, 2 to exit");
			choice = s.nextInt();
			
			if(choice != 1 & choice != 2){
				System.out.println("Invalid input, try again");
				System.out.println("Enter 1 to check another string, 2 to exit");
			}
			
	}		while(choice == 1);
		
		System.out.println("Exiting");
		s.close();
}
	
//	
//	public static void main(String[] args) {
//		
//		System.out.println("Enter 1 for a new string");
//		System.out.println("Enter 2 to exit");
//		Scanner scn = new Scanner(System.in);
//		
//		int option = scn.nextInt();
//		
//		switch(option){
//		
//		case 1 : isPalindrome();
//		
//		case 2 : break;
//		}
//			
//	}
//	
     static void isPalindrome(String s1){
		
		//System.out.println("Enter a string");
		String s2 ="";
		
		StringBuffer sb = new StringBuffer (s1);
		
		s2 = sb.reverse().toString();
		
		if (s1.equals(s2)){
			
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not a palindrome");
		}
		}
}
