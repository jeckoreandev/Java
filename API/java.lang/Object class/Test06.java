class Data{
	int data;
	public Data(int data){
		this.data= data;
	}
}

class Box6{
	private Object o;
	public Box6(Object o){
		this.o = o;
	}

	public Object getO(){
		return this.o;
	}
}

class Test06{
	public static void main(String[] args){
		Box6 box = new Box6(new Data(123));
		Data data = (Data)box.getO();
		System.out.println(data.data);
	}
}