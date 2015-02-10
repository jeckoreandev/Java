import java.util.Locale;

class SampleLocale03{
	public static void main(String[] args){

		Locale locJP = new Locale("ja" , "JP");
		Locale locFR = new Locale("fr" , "FR");

		System.out.println("locJP.getDisplayLanguage()       ;" + locJP.getDisplayLanguage());
		System.out.println("locJP.getDisplayLanguage(locJP)  ;" + locJP.getDisplayLanguage(locJP));
		System.out.println("locJP.getDisplayLanguage(locFR)  ;" + locJP.getDisplayLanguage(locFR));
		System.out.println();

		System.out.println("locJP.getDisplayCountry()        ;" + locJP.getDisplayCountry());
		System.out.println("locJP.getDisplayCountry(locJP)   ;" + locJP.getDisplayCountry(locJP));
		System.out.println("locJP.getDisplayCountry(locFR)   ;" + locJP.getDisplayCountry(locFR));
		System.out.println();

		System.out.println("locFR.getDisplayLanguage()       ;" +locFR.getDisplayLanguage());
		System.out.println("locFR.getDisplayLanguage(locJP)	 ;" +locFR.getDisplayLanguage(locJP));
		System.out.println("locFR.getDisplayLanguage(locFR)	 ;" +locFR.getDisplayLanguage(locFR));
		System.out.println();

		System.out.println("locFR.getDisplayCountry()        ;" +locFR.getDisplayCountry());
		System.out.println("locFR.getDisplayCountry(locJP)   ;" +locFR.getDisplayCountry(locJP));
		System.out.println("locFR.getDisplayCountry(locFR)   ;" +locFR.getDisplayCountry(locFR));

	}
}