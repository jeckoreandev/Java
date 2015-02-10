import java.util.Date;

public class SampleDate3{
	public static void main(String[] args){
		Date date = new Date(0L);
		System.out.println("Date(0) instance : " + date);

		date = new Date(1000000000L);
		System.out.println("Date(1000000000) 10 : " + date);
	}
}
