public class FinalString{
	public static void main(String[] arg){
		
		// String variable s1 is not final
		String s1 = "A";
		// String variable s2 is final variable 
		final String s2 = "B";
		// s2 += s1 ; Compile Error
		s1 += s2;
		System.out.println("s1 is : "s1);
		System.out.println(s2);


	}
}