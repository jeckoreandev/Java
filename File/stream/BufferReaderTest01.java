import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferReaderTest01{
	public static void main(String[] args)throws IOException{
		BufferedReader br = null;

		try{
			br = new BufferedReader(new FileReader("in.txt"));

			String line;
			while((line = br.readLine()) != null){
				System.out.print(line);
			}
		}finally{
			if(br != null){
				br.close();
			}
		}
	}
}