import util.money.Us;
import util.money.Jp;

public class Main{
	public static void main(String[] args){
		Us us = new Us(100);
		Jp jp = new Jp(200);

		int u = us.getUs();
		int j = jp.getJp();

		System.out.println(u);
		System.out.println(j);
	}
}