public class Box<T,E,F extends Number>{
		private final T t;
		private final E e;
		private final F f;
		public Box(T t, E e, F f){
			this.t = t;
			this.e = e;
			this.f = ;
		}
		public T getT(){
			return this.t;
		}
		public E getE(){
			return this.e;
		}
		public F getF(){
			return this.f;
		}
}