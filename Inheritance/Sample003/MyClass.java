class Sp{
	int foo(){
		System.out.println("Sp");
	return 0;
	}
}

class Sub extends Sp{
	int foo(){
		System.out.println("Sub");
	return 0;
	}

	int bar(){
		return new Sub().foo();
	}
}

class Ssub extends Sp{
	int foo(){
		System.out.println("OKOK Ssub");
		return 0;
	}
}


class Test{
	public static void main(String[] args){
		Sp s1 = new Sub();
		Sp s2 = new Ssub();
		Sub s3 = (Sub)s1;
		s1.foo();
		s2.foo();

			System.out.println(s1.foo());
			System.out.println(s2.foo());
			System.out.println(s3.bar());

	}
}