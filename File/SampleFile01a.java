import java.io.File;

class SampleFile01a{
	public static void main(String[] args){
		File file = new File(".\\test.txt");
		System.out.println(file.exists());
	}
}