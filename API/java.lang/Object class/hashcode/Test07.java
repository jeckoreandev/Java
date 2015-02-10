class Data{
	int x;
}

class MyClass{
	Data data;
	MyClass(Data data){
		this.data = data;
	}
}

class Test07{
	public static void main(String[] args){
		Data d = new Data();
		d.x = 10;

		MyClass mc1 = new MyClass(d);
		MyClass mc2 = mc1;
		System.out.println(mc1.data == mc2.data);
		System.out.println(mc1.equals(mc2));
		System.out.println(mc1.hashCode()==mc2.hashCode());

	}
}