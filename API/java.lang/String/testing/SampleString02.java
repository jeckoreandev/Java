public class SampleString02{
	public static void main(String[] args){
		String s = "AA";
		char[] c = {'A','A'};
		String s2 = new String(c);
		System.out.println(s == s2);
	}
}