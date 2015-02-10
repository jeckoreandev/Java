import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest01{
	public static void main(String[] args)throws IOException{
		FileWriter fw = null;

		try{
			fw = new FileWriter("out.txt");

			fw.write("abc\n");
			fw.write(65);
			fw.write("123");
			fw.write("私は韓国人だ");
		}finally{
			if(fw != null){
				fw.close();
			}
		}
	}
}