public class Outer{
	class Inner{

		int x; //InnerClass int type variable x
		
		//static int y; // compile ERROR static Member.
		
	// --------------- Inner Class ----------------------------
		Inner(int x){
			this.x = x;
		}

		void foo(int x){ // InnerClass instance Method
			System.out.println("Outer.Inner#foo()" + this.x + " : parameter" + x );
		}
		/* static void sbar(){ // InnerClass static Method Compile ERROR
		*					// instance InnerClassは　static Memberを持ちません。
		*  }
		*/
	// ------------ end Coding InnerClass-----------------
	}


	void bar(){ // OuterClass instance Method bar()
				// OuterClass instance MethodからInnerClassのMemberへAccess
		Inner i = new Inner(3);
		i.foo(1);
		System.out.println(i.x);

	}
	static void sbar(){ // OuterClass static Method sbar()
			Inner i = new Outer().new Inner(2);
			Outer.Inner i2 = new Outer().new Inner(3);
			i.foo(2);
			i2.foo(3);
			System.out.println(i.x);
	}
}


class Test{
	public static void main(String[] args){
		Outer.Inner i = new Outer().new Inner(5);
		i.foo(4);
		System.out.println(i.x);
		Outer o = new Outer();
		o.bar();
		o.sbar();
	}
}