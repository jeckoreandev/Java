class Data{
	private int x;

	public Data(int x){
		this.x = x;
	}

	public int getX(){
		return x;
	}
}

class Test06{
	public static void main(String[] args){
		Data d1 = new Data(3);
		Data d2 = new Data(3);

		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}