import java.io.FileReader;
import java.io.IOException;

class FileReaderTest{
	public static void main(String[] args)throws IOException{
		FileReader fr = null;

		try{
			fr = new FileReader("in.txt");
			int c;
			while((c = fr.read())!= -1){
				System.out.println((char)c);
			}
		}finally{
			if(fr != null){
				fr.close();
			}
		}
	}
}