package mainSystem;
import ExceptionList.AgeInputException;
import static ExceptionCatcher.AddData.addAge;

public class Student{
	private int age;
	public Student(int age){
		this.age  = addAge(age);
	}

	public void showData(){
		System.out.println(this.age);
	}
}