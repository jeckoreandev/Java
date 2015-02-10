class MyClass{
	private int x;
	public MyClass(int x){
		this.x = x;
	}

	public boolean equals(Object obj){
		MyClass mc = (MyClass)obj;
		if(mc.x == this.x){
			return true;
		}else{
			return false;
		}
	}

	public int hashCode(){
		return x * 17;
	}
}

class SampleHashCode02{
	public static void main(String[] args){
		MyClass mc1 = new MyClass(5);
		MyClass mc2 = new MyClass(5);

		System.out.println(mc1.equals(mc2));

		System.out.println(mc1.hashCode());
		System.out.println(mc2.hashCode());
	}
}