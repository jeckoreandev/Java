class ClassA{
	public void methodA(){
		ClassB classB = new ClassB();
		classB.getValue();
	}
}

class ClassB{
	public ClassC classC;

	public String getValue(){
		return classC.getValue();
	}
}

class ClassC{
	public String value;

	public String getValue(){
		value = "ClassB";
		return value;
	}
}

public class Question32{
	public static void main(String[] args){
		ClassA a = new ClassA();
		a.methodA();
	}
}

/*
Answer : An Exception is thrown at runtime.

java.lang.NullPointerException

at ClassB.getValue(Question32.java:12)
at ClassA.methodA(Question32.java:4)
at Question32.main(Question32.java:28)
*/