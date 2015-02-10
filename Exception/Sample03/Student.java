import AgeinputException;

public class Student{
	private int age;

	private int InputAge(int age){
		if(age < 0 ){
			throw  AgeinputException;
		}else{
			return age;
		}
	}
	public Student(int age){
		this.age = age;
	}
}