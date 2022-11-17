import java.io.FileReader;
import java.io.FileReader;

public class Filereaderdemo {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:test.txt");

            int i = 0;
            while((i=fr.read()) != -1) {	//condition for reading file; if there is nothing in the file it will return '-1'
                System.out.println(((char)i));	//typecasting the int 'j' to char
            }
            System.out.println("done");
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }}