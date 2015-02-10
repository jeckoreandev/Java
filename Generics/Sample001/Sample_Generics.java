class MyClassA{
	String s = "A";
}

class MyClassB{
	String s = "B";
}


class Test{
	public static void main(String[] args){
		//Boxクラスの型引数TにMyClassAクラスを与え、Box instanceを作る。
		Box<MyClassA> box1 = new Box<MyClassA>();
		// instance Box<MyClassA> に　setT(MyClassA t)を利用してMyClassA instanceを入れる。
		box1.setT(new MyClassA());

		//MyClassA型 mca変数に box<MyClassA>instanceを利用して代入する。
		MyClassA mca = box1.getT();

		System.out.println(mca.s);

		Box<MyClassB> box2 = new Box<MyClassB>();
		box2.setT(new MyClassB());
		MyClassB mcb = box2.getT();
		System.out.println(mcb.s);
	}
}