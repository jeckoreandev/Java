import java.util.Calendar;
import java.util.Date;

public class SampleCalendar07{
	public static void main(String[] args){

		Calendar c = Calendar.getInstance();
		Date date = new Date(0L);

		c.setTime(date);

		System.out.print(c.get(Calendar.YEAR) + " 年 ");
		System.out.print((c.get(Calendar.MONTH)+1)+" 月 ");
		System.out.println(c.get(Calendar.DATE)+ " 日 ");

		c.roll(Calendar.MONTH , 5);

		System.out.print(c.get(Calendar.YEAR) + " 年 ");
		System.out.print((c.get(Calendar.MONTH)+1)+" 月 ");
		System.out.println(c.get(Calendar.DATE)+ " 日 ");

		c.roll(Calendar.MONTH , 7);

		System.out.print(c.get(Calendar.YEAR) + " 年 ");
		System.out.print((c.get(Calendar.MONTH)+1)+" 月 ");
		System.out.println(c.get(Calendar.DATE)+ " 日 ");		
	}
}