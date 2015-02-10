class Super{
	int su;
	public Super(int su){
		this.su = su;
	}
	public int getSu(){return this.su;}
}
class Sub extends Super{int sb;}

class Test{
	public static void main(String[] args){
		Super[] su = new Sub[3];
		su[0] = new Sub(3);
	}
}