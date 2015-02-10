public class Outer{
		int x;
		int y;


	public class Inner{
		public Inner(){ // check Inner Class Instance
			System.out.println(this.toString());
			System.out.println("Outer Member X = " + x + "  Y = " + y+"\n");
			x++;
			y--;
		}
	}
	public Inner foo(){		
		return new Inner();
	}
}