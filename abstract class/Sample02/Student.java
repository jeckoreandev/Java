public class Student extends Human{
	private final String no;
	private String subject;
	private String classname;

	public Student(String name, String birthday,String no, String subject, String classname){
		super(name, birthday);
		this.no = no;
		this.subject = subject;
		this.classname = classname;
		}
	public Student(String name, String birthday,String no){
		super(name, birthday);
		this.no = no;
	}

	public String getNo(){
		return this.no;
	}
	public String getSubject(){
		return this.subject;
	}
	public String getClassname(){
		return this.classname;
	}

	public void showInfo(){
		new ShowInfo(getName(),getBirthday(),getNo(),getSubject(),getClassname());
	}
}