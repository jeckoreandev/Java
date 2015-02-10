class SampleWrapper02c{
	public static void main(String[] args){
		Integer x = Integer.valueOf(10);
		Integer y = Integer.valueOf("10");
		Integer z = Integer.valueOf("FF" , 16);



		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}