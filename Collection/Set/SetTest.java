import java.util.HashSet;
import java.util.Iterator;

class SetTest{
	public static void main(String[] args){

		HashSet<String> set = new HashSet<String>();

		boolean b1, b2, b3, b4;

		b1 = set.add("Tokyo");
		b2 = set.add("Paris");
		b3 = set.add("London");
		b4 = set.add("Paris");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();

		Iterator<String> iterator = set.iterator();

		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
	}
}