import java.util.ArrayList;
public class ShowInfo{
	ArrayList<String> infolist = new ArrayList<String>();
	public ShowInfo(String... info){
		for(int i = 0;i <info.length;i++){
			infolist.add(info[i]);
		}
		for(int i = 0 ; i < infolist.size(); i++){
			String element = infolist.get(i);
			System.out.println(i + " : " + element);
		}
	}
}