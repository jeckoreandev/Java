class SamplePool05{
	public static void main(String[] args){
		String s1 = new String("ABCD");
		String s2 = "ABCD";

		String s3 = "AB" + new String("CD");
		String s4 = new String("AB") + "CD";
		String s5 = new String("AB") + new String("CD");

		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		System.out.println(s1 == s4);
		System.out.println(s2 == s4);

		System.out.println(s1 == s5);
		System.out.println(s2 == s5);

		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		System.out.println(s5 == s3);


	}
}

