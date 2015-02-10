import java.io.File;
import java.io.IOException;

class SampleFile01b{
	public static void main(String[] args) throws IOException{
		File file = new File("text.txt");
		System.out.println(file.exists());
		System.out.println(file.createNewFile());
	}
}