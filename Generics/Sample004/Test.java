import java.util.ArrayList;
public class Test{
	public static void main(String[] args){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(3);
			list.add(145);
			System.out.println(list.get(0));
			
			System.out.println(list.size());
			for(int i = 0 ; i <list.size();i++){
				System.out.println(list.get(i) + " : ");
			}

	}
}