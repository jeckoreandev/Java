import java.util.*;
class Hancock{
	public void addString(List<? super String> list){
		list.add("foo");
	}
}