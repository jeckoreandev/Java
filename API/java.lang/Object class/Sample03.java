class Box{
	private Object obj;

	public Box(Object obj){
		this.obj = obj;
	}

	public Object getObj(){
		return this.obj;
	}

	public void setObj(Object obj){
		this.obj = obj;
	}
}


class MyClass{
	int x ;

	MyClass(int x){
		this.x=x;
	}
}
class SampleObject03{
public static void main(String[] args){
	Box b = new Box(new MyClass(7));

	MyClass mc = (MyClass)b.getObj();

	System.out.println(mc.x);
	}
}
