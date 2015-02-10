import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Deser{
	public static void main(String[] args) throws IOException{
		ObjectInputStream ois = null;

		try{
			ois = new ObjectInputStream(new FileInputStream("dog.ser"));

			Dog d = (Dog)ois.readObject();

			System.out.println(d.x);
			System.out.println(d.y);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			if(ois !=null){
				ois.close();
			}
		}
	}
}