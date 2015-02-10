class Outer{
	String outerX = "Outer instance variable";
	static String outerY = "Outer static variable";
	static final String outerfY = "Outer static final variable";

	public void foo(){
		//foo Method variable
		final String fooY = "foo()#final_variable";
		      String fooX = "foo()#_variable";
		
		//LocalClass
		//LocalClassはfoo()内のみ利用できる。つまり　class宣言　instance化 全てmethod内のみ
		class LocalInner{

			String strLIC = "LocalInnerClass variable";

			LocalInner(){ // LocalInnerClass Constractor
					System.out.println("Instance LocalInner");
			}
			void bar(){
				System.out.println("LocalInner#bar()");
				
				//LocalClassからfoo()の非final_variableを利用することはできない。
				//System.out.println(fooX);
				
				//LocalClassからfoo()のfinal_variableを利用する。
				System.out.println(fooY);
				System.out.println(strLIC);
			}
		// --------- end LocalInner Class--------
		}
		//-- area foo()--
		// LocalInnerClass instance化
		LocalInner i = new LocalInner();
		i.bar();
		System.out.println("foo() Access "+i.strLIC);
	//---- end foo() ----
	}

	static void bar(){
		final String strBar = "bar()final_variable";
		
		class LocalInner{
			LocalInner(){System.out.println("bar#Inner");}
				
				void foo(){ // bar()LocalInner foo()
					//LocalInnerClassからbar()のvariableを利用する。
			
					System.out.println(strBar);
				
					System.out.println(outerY);
				}
		}

		// bar()LocalInner Class の instance化
		LocalInner i = new LocalInner();
		i.foo();
	}
}

class Test{
	public static void main(String[] args){
		Outer outer = new Outer();
		System.out.println("---LocalInnerClass in instance Method");
		outer.foo();
		System.out.println();
		System.out.println("---LocalInnerClass in static Mehod");
		Outer.bar();
	}
}