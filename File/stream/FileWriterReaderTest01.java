import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterReaderTest01{
	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		FileWriter fw = null;

		try{

			fr = new FileReader("in.txt");
			fw = new FileWriter("out.txt");

			int c ;

			while((c = fr.read()) != -1){
				fw.write(c);
			}
		}finally{
			if(fr != null) fr.close();
			if(fw != null) fw.close();
		}
	}
}