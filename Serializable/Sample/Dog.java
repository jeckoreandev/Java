import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int x = -10;
	static int y = -20;
}

class Ser{
	public static void main(String[] args)throws IOException{
		Dog dog = new Dog();
		dog.x = 100 ; dog.y = 200;

		ObjectOutputStream oos = null;
		try{
			oos = new ObjectOutputStream(new FileOutputStream("dog.ser"));

			oos.writeObject(dog);
		}finally{
			if(oos != null){
				oos.close();
			}
		}
	}
}