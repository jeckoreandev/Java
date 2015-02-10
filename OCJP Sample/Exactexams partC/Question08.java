class Base{
	public static final String FOO = "foo";
	public static void main(String[] args){
		Base b = new Base();
		Sub s = new Sub();
		System.out.println(Base.FOO);
		System.out.println(Sub.FOO);
		System.out.println(b.FOO);
		System.out.println(s.FOO);
		System.out.println(((Base)s).FOO);
	}
}

class Sub extends Base{
	public static final String FOO="bar";
}