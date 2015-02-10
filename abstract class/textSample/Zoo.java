abstract class Zoo{
	static int count;
	String name;
	Zoo(){
		count++;
	}
	Zoo(String name){
		this.name = name;
	}

	int getCount(){
		return count;
	}
	abstract String getName();
}