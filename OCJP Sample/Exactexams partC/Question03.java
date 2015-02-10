import java.io.*;

class Forest implements Serializable {
    private Tree tree = new Tree();

    public static void main(String [] args) {
        Forest f = new Forest();
        try {

            FileOutputStream fs = new FileOutputStream("Forest.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(f); os.close();
        } catch (Exception ex) { ex.printStackTrace(); }
    } 
}

class Tree { }