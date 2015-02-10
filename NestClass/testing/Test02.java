class Outer{
	class Inner{
		void foo(){
			System.out.println("A");
		}
	}
	void bar(){// Outer classのinstance Method bar

		// Outer Class insatance
		Outer o = new Outer();

		// Outer.Inner type variable iを宣言
		Outer.Inner i;
		// variable iにnew instanceを代入。
		i = o.new Inner();
		// foo Method 
		i.foo();
		
		// i2はOuter.Inner型である　しかし　型の宣言はInnerのみ
		// Inner i2は Outer.が省略　new Inner() は　this.が省略されている
		Inner i2 = new Inner();
		i2.foo();

		// 明示的に表して宣言
		Outer.Inner i3 = this.new Inner();

			// ------- end Method bar()
	}

	static void sbar(){ // Outer class の　static Method sbar
				
				// Outer Class insatance
		Outer o = new Outer();

		// Outer.Inner type variable iを宣言
		Outer.Inner i;
		// variable iにnew instanceを代入。
		i = o.new Inner();
		// foo Method 
		i.foo();
		
		// i2は　Outer.Inner型である　Outer.は省略できる
		// sbar methodは　staticでありthis.を使いない。なのでOuter Classのinstanceが必要である。
		// つまり　static Methodからは　new Outer().new Inner()を明示的に書かなければいけない。
		Inner i2 = new Outer().new Inner();
		i2.foo();

		// 明示的に表して宣言
		Outer.Inner i3 = new Outer().new Inner();

			// ------- end Method bar()	
	}
}

class Test02{
	public static void main(String[] args){
		Outer o = new Outer();
		o.bar();
		o.sbar();
	}
}