class MyClass{}

class SampleEquals02{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		MyClass mc3 = mc1;

		System.out.println(mc1.equals(mc2));
		System.out.println(mc2.equals(mc3));
		System.out.println(mc3.equals(mc1));
	}
}