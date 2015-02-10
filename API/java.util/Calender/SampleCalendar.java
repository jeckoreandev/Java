import java.util.Calendar;
import java.util.Date;

public class SampleCalendar{
	public static void main(String[] args){

		Calendar cal = Calendar.getInstance();

		//System.out.println("Calendar 型の　参照値　：" +cal);
		//System.out.println("cal.toString() : " + cal.toString());


		System.out.println("------------------------------");


		System.out.print(cal.get(Calendar.YEAR) +"年 ");
		System.out.print(cal.get(Calendar.MONTH) +"月 ");
		System.out.print(cal.get(Calendar.DATE) +"日 ");
		System.out.print(cal.get(Calendar.HOUR) + "時 ");
		System.out.print(cal.get(Calendar.MINUTE) + "分 ");
		System.out.print(cal.get(Calendar.SECOND) + "秒" );


		// getTime Method and setTime Method

		Calendar c = Calendar.getInstance();

		Date date = c.getTime();
		System.out.println();
		System.out.println("Date date = c.getTime()　:"+date);

		date = new Date(0L);
		c.setTime(date);


		System.out.println("setTime(new Date(0L))");
		System.out.print(c.get(Calendar.YEAR) +"年 ");
		System.out.print(c.get(Calendar.MONTH) +"月 ");
		System.out.print(c.get(Calendar.DATE) +"日 ");
		System.out.print(c.get(Calendar.HOUR) + "時 ");
		System.out.print(c.get(Calendar.MINUTE) + "分 ");
		System.out.print(c.get(Calendar.SECOND) + "秒 ");



	}
}