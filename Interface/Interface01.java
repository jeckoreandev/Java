class A{
	public static final int I = 3;
}

class B extends A{
	public static void main(String[] arg){
		Integer a = A.I * B.I;
	}
}
