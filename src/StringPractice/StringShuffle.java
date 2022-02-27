package StringPractice;

public class StringShuffle {

	public static void main(String[] args) {
		
		String a = "HELL";
		String b = "world";
		
		int minlength = Math.min(a.length(), b.length());
		
		for(int i=0; i<minlength; i++){
		
			System.out.print(a.charAt(i));
			System.out.print(b.charAt(i));

		}
		
		if(a.length()>b.length()){
			
			System.out.println(a.substring(minlength));
		
		}
		
		else if(a.length()<b.length()){
			
			System.out.println(b.substring(minlength));
		}
	

	}

}
