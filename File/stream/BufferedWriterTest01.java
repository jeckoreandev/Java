import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterTest01{
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = null;

		try{
			bw = new BufferedWriter(new FileWriter("out.txt"));

			bw.write(97);
			bw.write(98);
			bw.write(99);
			bw.newLine();
			bw.write("ABC");


			bw.write("HE");
		}finally{
			if(bw != null){
				bw.close();
			}
		}
	}
}