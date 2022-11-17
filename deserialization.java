import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
//object input stream deserialization (byte stream to object)
public class deserialization {
    public static void main(String[] args) {	//main method
            try {
                //creating object of stream and passing file obj. as argument
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("D:test.txt"));
              xyz s = (xyz) obj.readObject();	//deserializing object
                System.out.println("id: "+s.id+"\nname: "+s.name+"\nfees: "+s.fees);
                obj.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

