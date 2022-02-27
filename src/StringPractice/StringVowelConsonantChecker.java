package StringPractice;

import java.util.Scanner;

public class StringVowelConsonantChecker {

	public static void main(String[] args) {

		System.out.println("Enter a string to reverse");

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'a' | s1.charAt(i) == 'A') {

				vowelCount++;
			} else if (s1.charAt(i) == 'e' | s1.charAt(i) == 'E') {

				vowelCount++;
			} else if (s1.charAt(i) == 'i' | s1.charAt(i) == 'I') {

				vowelCount++;
			}else if (s1.charAt(i) == 'o' | s1.charAt(i) == 'O'){
				
				vowelCount++;
			}else if (s1.charAt(i) == 'u' | s1.charAt(i) == 'U'){
				
				vowelCount++;
			}
		}
		System.out.println("Total no. of vowel are : " + vowelCount);
		consonantCount = s1.length() - vowelCount;
		System.out.println("Total no. of consonant are : " + consonantCount);
		
		sc.close();

	}

}
