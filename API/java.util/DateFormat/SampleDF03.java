import java.util.Date;
import java.text.DateFormat;

class SampleDF03{
	public static void main(String[] args){

		Date date = new Date(0L);

		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

		String s = df.format(date);

		try{
			Date d = df.parse(s);
			System.out.println(d);
		}catch(java.text.ParseException e){
			e.printStackTrace();
		}
	}
}