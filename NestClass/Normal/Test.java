public class Test{
	public static void main(String[] args){
		// Inner Class Instance
		// 確認できたのは　3つの方法

		//Outer instance 変数を使う。
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();

		//Outer instance から　また　Inner Classのinstanceを収得
		i1 = new Outer().new Inner();
		
		//Outer Classのmethodの戻り値からInner Classのinstanceを収得
		/* 注意: o1は Outer.Inner i1 = o1.new Inner(); 文で　member x ,yの数値が変化したままである
		 *		ここの変数　i1は　変化された　Outer Class Member x , y の値を出力する。
		 */
		i1 = o1.foo();
		
		//新しい　Outer instance から　Inner Class instanceを収得
		i1 = new Outer().foo();
		
		// 新しい変数o2にo1を代入
		Outer o2 = o1;
		// 新しい変数i2
		Outer.Inner i2;
		// 変数o2を利用してi2にinstanceを代入
		i2 = o2.new Inner();
	}
}