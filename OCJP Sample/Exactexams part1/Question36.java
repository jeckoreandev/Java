import java.io.*;
class Foo implements Serializable{
	public int x ,y;
	public Foo(int x , int y){
		this.x = x ; this.y = y;
	}

	private void writeObjectC(ObjectOutputStream s)
	throws IOException{
		s.writeInt(x); s.writeInt(y);
	}

	private void readObject(ObjectInputStream s)
	throws IOException,ClassNotFoundException{
		x = s.readInt();y=s.readInt();
	}
}