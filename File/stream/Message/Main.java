import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		BBSDao dao = new BBSDao();

		Message m1 = new Message();
		m1.setName("NAGAMOTO");
		m1.setComment("GOOD Afternoon!");

		dao.writeMessage(m1);


		ArrayList<Message> messages;

		messages = dao.getFileData();

		for(Message m : messages){
			System.out.println("--------------------");
			System.out.println("NAME:" + m.getName() + ", COMMENT : " + m.getComment());
		}
	}
}