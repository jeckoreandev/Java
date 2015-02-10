import java.util.Locale;

class SampleLocale02{
	public static void main(String[] args){
		Locale loc1 = new Locale("fr" , "FR");
		System.out.println(loc1.getLanguage() + " ; " + loc1.getCountry());

		Locale loc2 = new Locale("it" , "CH" );
		System.out.println(loc2.getLanguage() + " ; " + loc2.getCountry());

		Locale loc3 = new Locale("en");
		System.out.println(loc3.getLanguage() + " ; " + loc3.getCountry());
	}
}