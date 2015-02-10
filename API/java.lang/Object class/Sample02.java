class MyClass{

}

class SampleObject02{
	public static void main(String[] args){
		Object obj1 = new int[3];
		Object obj2 = new MyClass();

		int[] a = (int[])obj1;
		MyClass m = (MyClass)obj2;
	}
}