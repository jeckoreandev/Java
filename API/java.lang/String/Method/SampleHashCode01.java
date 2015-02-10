// hashCodeを出力する。
class SampleHashCode01{
	public static void main(String[] args){

		String s1 = new String("ABCD");
		String s2 = new String("EFGH");
		String s3 = new String("ABCD");

		System.out.println("s1 : " +Integer.toHexString(s1.hashCode()));
		System.out.println("s1 : " +Integer.toHexString(s2.hashCode()));
		System.out.println("s1 : " +Integer.toHexString(s3.hashCode()));

		System.out.println("s1==s3 : "+ s1==s3);

	}
}