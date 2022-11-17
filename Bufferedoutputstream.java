import java.io.FileOutputStream;

public class Bufferedoutputstream {
    public Bufferedoutputstream(FileOutputStream f) {
    }

    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("D:\\test.txt");// destination
            Bufferedoutputstream c =new Bufferedoutputstream(f);
         //  f.write(67);
          //  f.close();
           // System.out.println("done");
            String s = "sourav";
            byte b[] = s.getBytes();//converting string into byte
            f.write(b);
            f.close();
            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);

        }
    }}