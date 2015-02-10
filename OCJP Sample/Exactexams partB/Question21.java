class TestFive{
	private int x;

	public void foo(){
		int current = x;
		//System.out.print(x+ ",");
		x = current +1;
		//System.out.print(x+",");
	}

	public void go(){
		for(int i = 0 ; i < 5 ; i++){
			new Thread(){
				public void run(){
					foo();
					System.out.print(x+",");
				}
			}.start();
		}
	}
}

public class Question21{
	public static void main(String[] args){
		TestFive f = new TestFive();
		f.go();
	}
}