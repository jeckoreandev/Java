class Box<T , E>{
	private T t;
	private E e;

	Box(T t, E e){
		this.t = t;
		this.e = e;
	}
	public T getT(){
		return this.t;
	}
	public E getE(){
		return this.e;
	}
}
class GenericsInstance01{
	public static void main(String[] args){
		Box box;
		Box<String , String> box1 = new Box<String , String>(args[0] , args[1]);
		System.out.println(box1.getT());
		System.out.println(box1.getE());
		try{
		int x = new Integer(box1.getT()).intValue();
		int y = new Integer(box1.getE()).intValue();
		System.out.println(x + y);

		}catch(java.lang.NumberFormatException e){
			System.out.println("Not Number");

		}
	}
}