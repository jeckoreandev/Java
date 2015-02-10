import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

class PrintWriterTest02{
	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		PrintWriter pw = null;

		try{
			br= new BufferedReader(new FileReader("in.txt"));
			pw= new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));

			String line;

			while((line = br.readLine()) != null){
				pw.println("<" + line + ">");
			}
		}finally{
			if(br != null){
				br.close();
			}
			if(pw != null){
				pw.close();
			}
		}
	}
}