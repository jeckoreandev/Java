package ExceptionCatcher;
import ExceptionList.AgeInputException;

public class AddData{
	public static int AddAge(int age)throws AgeInputException{
		if(age < 0){
			throw new AgeInputException();
		} return age;
	}
}