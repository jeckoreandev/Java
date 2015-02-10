class SampleWrapper02e{
	public static void main(String[] args){
		int x = Integer.parseInt("120");
		int y = Integer.parseInt("F",16);
		Integer a = x;
		System.out.println(a.toBinaryString(a));

		System.out.println(x);
		System.out.println(y);
	}
}