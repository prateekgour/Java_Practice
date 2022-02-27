package StringPractice;

public class StringReplace {

	public static void main(String[] args) {
		
		String s1 = "abcd*d";
		int starPosition = 0;
		
		starPosition = s1.indexOf('*');
		
		System.out.println(starPosition);
		String s2 = s1.substring(0,starPosition-1) + s1.substring(starPosition+2);
		System.out.println(s2);

	}

}
