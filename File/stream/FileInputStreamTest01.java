import java.io.FileInputStream;
import java.io.IOException;

class FileInputStream{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;

		try{
			fis = new FileInputStream("in.txt");

			int c;

			while((c = fis.read()) != 1){
				System.out.printf("%02x",c);
			}
		}finally{
			if(fis != null){
				fis.close();
			}
		}
	}
}