import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Data implements Serializable{
	int x;
}

class Dog implements Serializable{
	Data d;
}

class Ser{
	public static void main(String[] args) throws IOException{
		Dog dog = new Dog();
		dog.d = new Data();
		dog.d.x = 100;

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