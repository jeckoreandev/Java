class Popcorn{
	public void pop(){
		System.out.println("popcorn");
	}
}

class Food{
	Popcorn p = new Popcorn(){
	
		public void sizzle(){
			System.out.println("anonymous sizzling popcorn");
		}
	
		public void pop(){
			System.out.println("anonymous popcorn");
		}
	};

	public void popIt(){
		p.pop();

		//Popcorn classはsizzle()がないので無効
		p.sizzle(); 
	}
}

class Test{
	public static void main(String[] args){
		Food f = new Food();
		f.popIt();
	}
}