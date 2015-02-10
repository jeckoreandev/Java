public abstract class AbstractSuper{
	private int age;
	private String name;

	public AbstractSuper(int age , String name){
		this.age = age;
		this.name = name;
	}

	public abstract int getAge();
	public abstract int getName();
}
