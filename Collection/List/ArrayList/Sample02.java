import java.util.ArrayList;

class Sample02{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("HELLO!!!!!");
		list.add((Integer)list.get(0));
	}
}