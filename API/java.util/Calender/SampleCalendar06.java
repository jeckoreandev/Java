import java.util.Calendar;
import java.util.Date;

public class SampleCalendar06{
	public static void main(String[] args){

		Calendar c = Calendar.getInstance();
		Date date = new Date(0L);
		c.setTime(date);
		System.out.print("                             ");
		System.out.print(c.get(Calendar.YEAR) + " YEAR " );
		System.out.print(c.get((Calendar.MONTH)+1) + " MONTH ");
		System.out.print(c.get(Calendar.DATE) + " DATE ");
		System.out.println();
		// add METHOD! 1������5�������i�߂�B
		c.add(Calendar.MONTH, 5);
		System.out.print(" c.add(Calendar.MONTH , 5) : ");
		System.out.print(c.get(Calendar.YEAR) + " YEAR " );
		System.out.print(c.get((Calendar.MONTH)+1) + " MONTH ");
		System.out.print(c.get(Calendar.DATE) + " DATE ");
		System.out.println();

		// add METHOD! 6������7�������i�߂�B

		c.add(Calendar.MONTH , 7);
		System.out.print(" c.add(Calendar.MONTH , 7) : ");
		System.out.print(c.get(Calendar.YEAR) + " YEAR " );
		System.out.print(c.get((Calendar.MONTH)+1) + " MONTH ");
		System.out.print(c.get(Calendar.DATE) + " DATE ");

	}
}