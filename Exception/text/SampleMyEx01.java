class MyException extends Exception{
	MyException(){
		super("brithing MyException!!!!!!");
	}
}

class MyClass{
	void foo() throws MyException{
		System.out.println("MyClass#foo()");
		throw new MyException();
		// 
	}
}

class SampleMyEx01{
	public static void main(String[] args){
		try{
			MyClass mc = new MyClass();
			mc.foo();
		}catch(MyException e){
			System.out.println("MyException");
			System.out.println("StackTrace");
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}