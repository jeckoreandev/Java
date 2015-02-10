import java.util.Date;
public class Sub{
	private static String name;
	private static String no;
	private static Date birthday;

	
	protected class Setter{
		public Setter(){}
		public Setter(String name , String no){
			Sub.name = name;
			Sub.no = no;
		}
	}
	protected class SetterPlus extends Setter{
		public static SetterPlus(String name, String no, Date birthday){
			super(name,no);
			Sub.birthday = birthday;
		}
	}
}