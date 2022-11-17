
import java.io.*;
import java.io.*;
   class CopyFile {
        public static void main(String[] args) {
            try {
                byte array[]=new byte[1024];
                FileInputStream fin=new FileInputStream("C:\\New test.txt");
                FileOutputStream fout=new FileOutputStream("D:\\test.txt");
                int i;
                while((fin.read(array))>0) {
                    fout.write(array);
                }
                System.out.println("done");
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

