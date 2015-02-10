import java.util.Calendar;
import java.util.Date;

public class SampleCalendar{
	public static void main(String[] args){

		Calendar cal = Calendar.getInstance();

		//System.out.println("Calendar �^�́@�Q�ƒl�@�F" +cal);
		//System.out.println("cal.toString() : " + cal.toString());


		System.out.println("------------------------------");


		System.out.print(cal.get(Calendar.YEAR) +"�N ");
		System.out.print(cal.get(Calendar.MONTH) +"�� ");
		System.out.print(cal.get(Calendar.DATE) +"�� ");
		System.out.print(cal.get(Calendar.HOUR) + "�� ");
		System.out.print(cal.get(Calendar.MINUTE) + "�� ");
		System.out.print(cal.get(Calendar.SECOND) + "�b" );


		// getTime Method and setTime Method

		Calendar c = Calendar.getInstance();

		Date date = c.getTime();
		System.out.println();
		System.out.println("Date date = c.getTime()�@:"+date);

		date = new Date(0L);
		c.setTime(date);


		System.out.println("setTime(new Date(0L))");
		System.out.print(c.get(Calendar.YEAR) +"�N ");
		System.out.print(c.get(Calendar.MONTH) +"�� ");
		System.out.print(c.get(Calendar.DATE) +"�� ");
		System.out.print(c.get(Calendar.HOUR) + "�� ");
		System.out.print(c.get(Calendar.MINUTE) + "�� ");
		System.out.print(c.get(Calendar.SECOND) + "�b ");



	}
}