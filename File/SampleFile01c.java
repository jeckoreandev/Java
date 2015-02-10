import java.io.File;

class SampleFile01c{
	public static void main(String[] args){
		File dir = new File("mydir");
		System.out.println(dir.exists());
		System.out.println(dir.mkdir());
	}
}