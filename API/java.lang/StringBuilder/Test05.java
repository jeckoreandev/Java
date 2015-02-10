class Test05{
	public static void main(String[] args){
		StringBuffer s1 = new StringBuffer("Hello");
		s1.append("Goodbye");
		s1.delete(2,7);
		System.out.println(s1);
	}
}