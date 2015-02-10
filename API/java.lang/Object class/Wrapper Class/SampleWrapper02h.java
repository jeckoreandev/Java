class SampleWrapper02h{
	public static void main(String[] args){
		int i = 15;

		String s1 = Integer.toBinaryString(i);
		String s2 = Integer.toOctalString(i);
		String s3 = Integer.toHexString(i);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}