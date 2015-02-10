import java.util.Date;
import java.text.DateFormat;

class SampleDF01{
	public static void main(String[] args){
		Date date = new Date(0L);

		System.out.println(date);


		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(date));
	}
}