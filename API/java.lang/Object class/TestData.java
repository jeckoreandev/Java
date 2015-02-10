class Data{
	int x;
}


class Test{
	public static void main(String[] args){
		Data d = new Data();
		d.x = 10;
	 MyClass mc1 = new MyClass();
	 MyClass mc2 = new MyClass();

		System.out.println(mc1.data == mc2.data);
	}
}