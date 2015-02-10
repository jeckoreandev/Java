import java.text.NumberFormat;
import java.util.Locale;

class SampleNF01{
	public static void main(String[] args){
		double d = 123.4567;

		Locale locFR = new Locale("fr" , "FR");

		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(d));

		NumberFormat nf_fr = NumberFormat.getInstance(locFR);
		System.out.println(nf_fr.format(d));

		NumberFormat nfc = NumberFormat.getCurrencyInstance();
		System.out.println(nfc.format(d));

		NumberFormat nfc_fr = NumberFormat.getCurrencyInstance(locFR);
		System.out.println(nfc_fr.format(d));
	}
}