class MyClass{
	String name ="Yamada";
	int age = 33;
}

class SampleToString01{
	public static void main(String[] args){
		MyClass mc = new MyClass();
		String str = mc.toString();
		System.out.println(str);
	}
}