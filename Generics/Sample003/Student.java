public class Student{
	Box box;

	Student(String name , String age){
		box = new Box<String , String>(name , age);
	}

	public String getName(){
		return (String)this.box.getT();
	}
	public String getAge(){
		return (String)this.box.getU();
	}
}