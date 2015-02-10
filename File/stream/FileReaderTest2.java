import java.io.FileReader;
import java.io.IOException;

class FileReaderTest2{
	public static void main(String[] args){
		FileReader fr = null;

		try{
			fr = new FileReader("in.txt");
			int c;// int
			String s = "";
				while((c = fr.read())!= -1){
					s += (Integer.toHexString(c)+" ");
					
				}
			System.out.print(s.toUpperCase());

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fr != null){
				try{
					fr.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}