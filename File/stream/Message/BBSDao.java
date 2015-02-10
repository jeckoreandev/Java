import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BBSDao{
	public ArrayList<Message> getFileData(){
		BufferedReader br = null;

		ArrayList<Message> messages = new ArrayList<Message>();

		try{
			br = new BufferedReader(new FileReader("bbs_data.txt"));

			String line = "";

			while((line = br.readLine()) != null){
				Message m = new Message();

				m.setName(line);
				line = br.readLine();
				m.setComment(line);

				messages.add(m);
			}
		}catch(Exception e){
			System.out.println("FileからのData取得に失敗しました。");
		}finally{
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException e){
				System.out.println("Input Output Exception");
			}
		}
		return messages;
	}

	public void writeMessage(Message message){
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter("bbs_data.txt",true));

			String line = message.getName()+"\r\n" + message.getComment()+"\r\n";

			bw.write(line);
		}catch(Exception e){
			System.out.println("書き込みエラーが生じました。");
		}finally{
			try{
				if(bw != null){
					bw.flush();
					bw.close();
				}
			}catch(IOException e){
				System.out.println("IOException");
			}
		}
	}
}