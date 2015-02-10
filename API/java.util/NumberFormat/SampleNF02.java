import java.text.NumberFormat;
import java.text.ParseException;

class SampleNF02{
	public static void main(String[] args){
		double d = 123.4567;

		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		System.out.println(nf.format(d));

		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(d));

		try{
			System.out.println(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse("1234.567"));
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}