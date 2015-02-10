import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BWRTest01{
	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		BufferedWriter bw = null;

		try{

			br = new BufferedReader(new FileReader("in.txt"));
			bw = new BufferedWriter(new FileWriter("out.txt"));

			String line;

			while((line = br.readLine()) != null){
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		}finally{
			if(br != null){
				br.close();
			}
			if(bw != null){
				bw.close();
			}
		}
	}
}