

class SampleTest02{
	public static void main(String[] args){
		StringBuffer bf1 = new StringBuffer("abc");
		StringBuffer bf2 = new StringBuffer("abc");
		StringBuffer bf3 = bf1;

		System.out.println(bf1.equals(bf2));
		System.out.println(bf1.equals(bf1));

		double d = 1.13;
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));

	}
}


