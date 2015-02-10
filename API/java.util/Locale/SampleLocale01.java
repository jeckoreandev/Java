import java.util.Locale;

class SampleLocale01{
	public static void main(String[] args){

		Locale loc = Locale.getDefault();

		System.out.println("language Code :"+loc.getLanguage());

		System.out.println("Country Code :"+loc.getCountry());
	}
}