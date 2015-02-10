public class Box<T>{
	private T t;
	public void setT(T t){
		this.t = t;
	}
	public T getT(){
		return this.t;
	}
}

class Boxsub<T> extends Box<T>{
	Boxsub(T t){
		super.setT(t);
	System.out.println("sub" +getT());
	}
}

class Test{
	public static void main(String[] args){
		Boxsub<Integer> box = new Boxsub<Integer>(3);
		box.getT();
	}
}