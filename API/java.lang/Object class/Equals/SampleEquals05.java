class MyClass{
	private int x;

	public MyClass(int x){
		this.x = x;
	}

	public int getX(){
		return this.x;
	}

	public boolean equals(Object obj){
		if((obj instanceof MyClass) && ((MyClass)obj).getX() == this.x){
			return true;
		}else{
			return false;
		}
	}
}

class SampleEquals05{
	public static void main(String[] args){
		MyClass mc1 = new MyClass(5);
		MyClass mc2 = new MyClass(5);
		MyClass mc3 = new MyClass(8);

		System.out.println(mc1.equals(mc2));
		System.out.println(mc2.equals(mc3));
		System.out.println(mc3.equals(mc1));
	}
}
