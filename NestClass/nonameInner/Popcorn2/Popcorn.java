public class Popcorn{
	public void pop(){
		System.out.println("popcorn");
	}
}

class Food{
	Popcorn p = new Popcorn(){
		public void pop(){
			System.out.println("anonymous popcorn");
		}
	};
	public void show(){
		p.pop();
	}
}

class Test{
	public static void main(String[] args){
		Food f = new Food();
		f.show();
	}
}
