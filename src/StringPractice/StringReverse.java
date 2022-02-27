package StringPractice;

import java.util.Scanner;

public class StringReverse {
	
	public static void main (String args[]){
		
		System.out.println("Enter a string to reverse");
		
		Scanner sc = new Scanner (System.in);
		String original = sc.nextLine();
		
		char ch[] = new char[original.length()];
	
		for(int i=0; i<original.length(); i++){
			
			ch[i] = original.charAt(original.length() - i-1);
			
		}
		for (int i=0; i<ch.length; i++){
			
			System.out.print(ch[i]);
		}
		
		sc.close();
	}

}
