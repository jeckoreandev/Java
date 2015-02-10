class B extends ClassA{
	public void process() throws IOException{
		super.process();
		System.out.println("B,");
		throw new IOException();
	}

	public static void main(String[] args){
		try{
			new B().process();
		}catch (IOException e){
			System.out.println("Exception");
		}
	}
}