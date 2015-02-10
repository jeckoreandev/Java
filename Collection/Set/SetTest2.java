import java.util.HashSet;
import java.util.Iterator;

class MyClass{
	int d;
	MyClass(int d){
		this.d = d;
	}
}


class SetTest2{
	public static void main(String[] args){
		HashSet<MyClass> set = new HashSet<MyClass>();

		set.add(new MyClass(3));
		set.add(new MyClass(1));
		set.add(new MyClass(4));
		set.add(new MyClass(2));
		set.add(new MyClass(3));


		Iterator<MyClass> iterator = set.iterator();
		while(iterator.hasNext()){
			MyClass element = iterator.next();
			System.out.println(element + ":" +element.d);
		}
	}
}