class Box<T,U>{

private T t;
private U u;

	public Box(T t, U u){
		this.t = t;
		this.u = u;
	}

	public T getT(){
		return this.t;
	}
	public U getU(){
		return this.u;
	}
}

	class C{}
	interface I{}

	class Test{
		public static void main(String[] args){
			Box<String , Integer> b1;

			Box<int[] , String> b2;

			Box<C , C> b3;

			Box<I , C> b4;

			Box b5;

			// Box<int , double> b;  Compile error
			// Box<C> b ; Compile Error
		}
	}