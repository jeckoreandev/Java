
public class Box{
	public <T extends Number> void foo(MyClass<T> t){
		System.out.println(t);
	}
}