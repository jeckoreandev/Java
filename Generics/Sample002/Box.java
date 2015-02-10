abstract class Box<T>{
	private T t;
	public Box(T t) { this.t = t;}
	public T get()	{ return this.t;}
	public abstract void show();
}

class BoxSub<T> extends Box<T>{
	public BoxSub(T t){
		super(t);
	}

	public void show(){
		System.out.println(super.get().toString() + " : " + super.get().hashCode());
	}
}