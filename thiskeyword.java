public class thiskeyword {
        int rollno;
        String name ;
        float fee;
      /*  static String collage= "jis";
        static void change(){
            collage="jis";}*/
        thiskeyword(int rollno,String name,float fee){
            this.rollno= rollno;
            this.name= name;
            this.fee= fee;


        }
        void dispaly() {

            System.out.println(rollno + " " + name + " " + fee);
        }
        static class test{
            public static void main(String[] args) {
                staticvar.change();
                thiskeyword s1= new thiskeyword(111,"srikanta",200);
                thiskeyword s2= new thiskeyword(555,"sourav",500);
                s1.dispaly();
                s2.dispaly();

            }

        }}


