public class Sub extends AbastractSuper{
	private String add;
	public Sub(int age, String name, String add){
		super(age , name);
		this.add = add;
	}
	public Sub(int age, String name, String add){
		super(age , name);
		this.add="no Address";
	}

}