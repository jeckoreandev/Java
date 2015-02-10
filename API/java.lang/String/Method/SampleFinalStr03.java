/* finalなString型変数を理解する。
*
*/
class SampleFinalstr03{
	public static void main(String[] args){
		String a = "ABCD";

		final String s1 = "AB";
		String s2 = s1+"CD";

		String s3 = "AB";
		String s4 = s3 + "CD";
		
		// s2 = final変数　s1+"CD" ==　非final変数　a(ABCD)　trueを返す。
		System.out.println(s2 == a); 
		
		// s4 = 非final変数　s3 + "CD" == 非final変数　a(ABCD) falseを返す。 
		System.out.println(s4 == a);
		
		// s1はfinal変数　s3は非final変数 trueを返す。
		System.out.println(s1 == s3);
		
		// s2は非final変数　s4は非final変数　falseを返す。
		System.out.println(s2 == s4);

		// 上の結果から、
		System.out.println("s2 and aの　hashCodeの比較  :"+ (s2.hashCode()==a.hashCode()));
		System.out.println("s2のequals(a) の結果 :"+s2.equals(a));

		// (s4 == a ) の結果はfalseであるが　hashCode , equals の結果は　trueである。
		// equals 理由は　StringClass の　equals method が　オーバーライドされている　ロジックは
		// 比較対象objectを比較、等しいければtrueを返す。
		// hashCode 理由は　instanceが異なっても文字列が同じならば同じhashCode値が得られます。
		System.out.println("s4 と a の　hashCodeの比較　：" + (s4.hashCode()==a.hashCode()));
		
		System.out.println("s4のequals(a) の結果 :"+s4.equals(a));

		// equalsIgnoreCase(String anotherString)
		// このStringとほかの　Stringを比較します。
		System.out.println("equalsIgnoreCase s2 , a : " + (s2.equalsIgnoreCase(a)));


		// String Class の　toString() 持っている文字列を返す。
		System.out.println(s1.toString());



		//
	}
}