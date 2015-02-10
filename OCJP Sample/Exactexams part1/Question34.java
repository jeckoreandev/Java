class Foo{
	public int a = 3;
	public void addFive(){ a += 5; System.out.print("f");}
}

class bar extends Foo{
	public int a = 8;

	public void addFive(){
		this.a += 5;
		System.out.print(" b ");
	}

	public static void main(String[] args){
		Foo f = new bar();
		f.addFive();
		System.out.println(f.a);
	}

}

