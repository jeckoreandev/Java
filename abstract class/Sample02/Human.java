public abstract class Human{

	private final String name;
	private final String birthday;

	public Human(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
	}
	public Human(String name){
		this(name, null);
	}

	public String getName(){
		return this.name;
	}
	public String getBirthday(){
		return this.birthday;
	}
	public abstract void showInfo();
}
