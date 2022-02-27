package StringPractice;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter 1st string");
		String  s1 = scn.nextLine();
		
		System.out.println("Enter 2nd string");
		String s2 = scn.nextLine();
		
		if(s1.length() > s2.length()){
			
			System.out.println("1st string is longer");
			System.out.println("After append "+s1.concat(s2));
		}
		else{
			System.out.println("2nd string is longer");
			System.out.println("After append "+s2.concat(s1));
		}
		
		

	}

}
