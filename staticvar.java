
 public class staticvar {
    int rollno;
    String name ;
    float fee;
    static String collage= "jis";
    static void change(){
        collage="jis";}
    staticvar(int rollno,String name,float fee){
        this.rollno= rollno;
        this.name= name;
        this.fee= fee;


    }
    void dispaly() {

        System.out.println(rollno + " " + name + " " + fee+" "+collage);
    }
    static class staticvar1{
        public static void main(String[] args) {
            staticvar.change();
            staticvar s1= new staticvar(111,"srikanta",200);
            staticvar s2= new staticvar(555,"sourav",500);
            s1.dispaly();
            s2.dispaly();

        }

    }}








