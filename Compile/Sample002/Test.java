class MyClass{
	void foo(){
		System.out.println("MyClass#foo()");
	}
}



class Test extends MyClass{
	@Override
	void foo(){
		System.out.println("Test#foo()");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.foo();
	}
}