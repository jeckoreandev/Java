import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterTest{
	public static void main(String[] args) throws IOException{
		PrintWriter pw = null;

		try{

			pw = new PrintWriter(new BufferedWriter (new FileWriter("out.txt")));

			pw.println("Hello");
			pw.println(123);
			pw.printf("%05d\n", 12);
			pw.printf("%.2f\n",12.555);

			pw.flush();
		}finally{
			if(pw != null){
				pw.close();
			}
		}
	}
}