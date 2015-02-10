interface Foo{ int bar();}

class Sprite{
	public int fubar(Foo foo) {return foo.bar();}
	public void testFoo(){
		fubar(
			new Foo(){public int bar(){return 1;}
			}
		);
	}
}


