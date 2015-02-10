import java.io.PrintWriter;
class Test{
	public static void main(String[] args){
		BoxSub<Integer> boxsi = new BoxSub<Integer>(12);
		boxsi.show();
		BoxSub boxss = new BoxSub<String>("12");
		boxss.show();
		BoxSub boxo = new BoxSub<Object>("12");
		boxo.show();
		System.out.println(boxsi.get());
	}
}