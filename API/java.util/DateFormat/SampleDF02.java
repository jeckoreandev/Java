import java.util.Date;
import java.text.DateFormat;

class SampleDF02{
	public static void main(String[] args){

		Date date = new Date(0L);

		DateFormat df1 = DateFormat.getInstance();
		System.out.println(df1.format(date));

		DateFormat df2 = DateFormat.getDateInstance();
		System.out.println(df2.format(date));

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df3.format(date));

		DateFormat df4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df4.format(date));

		DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df5.format(date));

		DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df6.format(date));
	}
}