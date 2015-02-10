
class SampleEx02{
	int[] a = {10,20,30};
	void foo(){
	 a[3] = 0;
	}
	public static void main(String[] args){
		SampleEx02 s = new SampleEx02();
		s.foo();
	}
}