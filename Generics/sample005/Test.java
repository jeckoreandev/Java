class Test{
	public static void main(String[] args){
		BSub<String> bsub = new BSub<String>();
		Box<Integer> box = new BSub<Integer>();

		bsub.t = "123";
		System.out.println(bsub.t);

		box = bsub;

	}
}