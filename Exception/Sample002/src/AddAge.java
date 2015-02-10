public class AddAge{
	public static int insertAge(int age){
		if(age < 0){
			new AgeInputException();
		} return age;
	}
}