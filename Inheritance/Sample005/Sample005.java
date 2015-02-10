class Sp{
	static void foo(){
		System.out.println("A");
	}
}
class Sub extends Sp{

}

class Test{
	public static void main(String[] args){
		Sub s1 = new Sub();
		s1.foo();
		Sp s2 = (Sp) s1;
		double a =(double)(8.0+10.0+5.0+8.0+9.0)/5;
		System.out.println(a);
	}
}