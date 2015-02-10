abstract class T{
	public abstract int foo();
}

class S1 extends T{
	int x = 10;
	public int foo(){
		return x;
	}
}

class S2 extends T{
	int x = 20;
	public int foo(){
		return x;
	}
}


class Test04{
	public static void main(String[] args){
		Object[] objs = {new S1(), new S1(), new S2()};
		for(Object o : objs){
			System.out.println(((T)o).foo());
		}
	}
}