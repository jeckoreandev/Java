public class Student{
	private int age;

	public Student(int age){
		this.age = AddAge.insertAge(age);
		System.out.println("Insert age :" +age);
	}
}