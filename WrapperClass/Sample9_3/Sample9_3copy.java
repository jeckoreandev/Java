class Sample9_3{
	public static void main(String[] args){
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		int sum = i1 + i2;

		String s1 = Integer.toBinaryString(i1);
		String s2 = Integer.toBinaryString(i2);
		String sSum = Integer.toBinaryString(sum);

		System.out.println(i1 + "の進数は"+s1);
		System.out.println(i2 + "の進数は"+s2);
		System.out.println(sSum + "の進数は" +sSum);
	}
}