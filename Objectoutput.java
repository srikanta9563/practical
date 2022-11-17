
    import java.io.*;
    class Student1 implements Serializable{
        int id;
        String name;
        //transient
        int fees;
        Student1(int id,String name,int fees){
            this.id=id;
            this.name=name;
            this.fees=fees;
        }}
   class ObjectOutput {
        public static void main(String[] args) {
            try {
                Student1 s=new Student1(10,"Srikanta",10000);
                FileOutputStream fout=new FileOutputStream("D:\\test.txt");
                ObjectOutputStream oout=new ObjectOutputStream(fout);
                oout.writeObject(s);
                oout.close();
                System.out.println("done");
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }

    }
