class MyClass{
	String name = "Yamada";
	int age = 33;

	public String toString(){
		return name + " : " + age;
	}
}

class SampleToString04{
	// Object Class toString method is Override
	public static void main(String[] args){
		MyClass mc = new MyClass();
		System.out.println(mc.toString());
	}
}