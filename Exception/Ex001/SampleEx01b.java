class SampleEx01b{
	public static void main(String[] args){
		Data data = new Data();
		data.foo();
	}
}

class Data{
	void foo(){
		foo();
	}
}