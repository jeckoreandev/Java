public class Popcorn{
	void pop(){
		System.out.println("Popcorn");
	}
}


class Food{
	Popcorn p = new Popcorn(){ // create Noname Inner Class 
		void pop(){
			System.out.println("anoymous Popcorn");
		}
	};
}


class Test{
	public static void main(String[] args){
		Food f = new Food();
		f.p.pop();
	}
}