public class Test08{
	public static void main(String[] args){
		String s1 = "AA";
		String s2 = "A";
		s2 +=  "A";


		StringBuffer sb1 = new StringBuffer("AA");
		StringBuilder sf1 = new StringBuilder("AA");

		System.out.println(s1 == s2);
		System.out.println(s2.toString());
		System.out.println(sb1.toString());
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println("StringBuilder & StringBuffer");

		System.out.println(sb1.equals(sf1));
		System.out.println(s1.equals(sf1));
	}
}