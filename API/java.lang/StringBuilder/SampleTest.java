class SampleTest{
	public static void main(String[] args){
		StringBuilder builder = new StringBuilder("HELLO");
		StringBuffer buffer = new StringBuffer("World");
		builder.append("world");
		System.out.println(buffer+" "+builder);
		buffer.delete(0,0);
		System.out.println(buffer);

		StringBuilder builder2 = new StringBuilder("HELLO ");
		builder2.insert(7,"World");
		System.out.println(builder2);
	}
}