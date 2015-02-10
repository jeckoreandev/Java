import java.io.File;

class SampleFile01{
	public static void main(String[] args){
		String ps = File.pathSeparator;
		String s = File.separator;
		char c = File.pathSeparatorChar;
		System.out.println("PATH Separator : " + ps);
		System.out.println("Diractory Separator : " + s);
		System.out.println("Path Separator charactor : "+c);
	}
}