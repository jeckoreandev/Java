interface Declarestuff{
	public static final int EASY = 3;
	void dostuff(int t);
}

class TestDeclare implements Declarestuff{
	public static void main(String[] args){
		int x = 5;
			new TestDeclare().dostuff(++x);
	}
	void dostuff(int s){
		s+= EASY + ++s;
		System.out.println("s " + s);
	}
}