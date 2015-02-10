import java.io.File;

class Test10{
	public static void main(String[] args){
		boolean newDir = false;

		File dir = new File("Hello");

		System.out.println(dir.exists());

		newDir = dir.mkdir();
		System.out.println(dir.exists());
		System.out.println(dir.delete());
		System.out.println(dir.exists());
	}
}