public class Test{
	public static void main(String[] args){
		Student	s = new Student(args[0] , args[1]);

		System.out.println(s.getName()+":"+s.getAge());
	}
}