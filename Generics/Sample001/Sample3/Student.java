public class Student{
	Box<String,String,Integer> box;

	public Student(String name, String birthday,Integer no){
		box = new Box(name,birthday,no);
	}
	public String getName(){return box.getT();}
	public String getBirthday(){return box.getE();}
	public Integer getNo(){return box.getF();}
}