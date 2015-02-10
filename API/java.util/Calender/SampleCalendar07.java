import java.util.Calendar;
import java.util.Date;

public class SampleCalendar07{
	public static void main(String[] args){

		Calendar c = Calendar.getInstance();
		Date date = new Date(0L);

		c.setTime(date);

		System.out.print(c.get(Calendar.YEAR) + " ”N ");
		System.out.print((c.get(Calendar.MONTH)+1)+" ŒŽ ");
		System.out.println(c.get(Calendar.DATE)+ " “ú ");

		c.roll(Calendar.MONTH , 5);

		System.out.print(c.get(Calendar.YEAR) + " ”N ");
		System.out.print((c.get(Calendar.MONTH)+1)+" ŒŽ ");
		System.out.println(c.get(Calendar.DATE)+ " “ú ");

		c.roll(Calendar.MONTH , 7);

		System.out.print(c.get(Calendar.YEAR) + " ”N ");
		System.out.print((c.get(Calendar.MONTH)+1)+" ŒŽ ");
		System.out.println(c.get(Calendar.DATE)+ " “ú ");		
	}
}