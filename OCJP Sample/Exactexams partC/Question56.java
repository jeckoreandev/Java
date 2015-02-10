public class Question56{
	public static void main(String[] args){
		StringBuffer s = new StringBuffer("123456789");
		s.delete(0,3);
		System.out.println(s);
		s.replace(1,3,"24");
		System.out.println(s);
		s.delete(4,6);
		System.out.println(s);
		System.out.println("------------------");

		StringBuilder ss = new StringBuilder("123456789");
		ss.delete(0,3);
		System.out.println(ss);
		ss.delete(1,3);
		System.out.println(ss);
		ss.delete(2,5);
		System.out.println(ss);
		ss.insert(1,"24");
		System.out.println(ss);
	}
}