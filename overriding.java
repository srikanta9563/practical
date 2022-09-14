public class overriding {// parrent class
    void run(){
        System.out.println("running mode on");

    }}
    class Testoverrding extends overriding{
        //child class
        //defining same name method as its declared in parent class
        void run(){
            System.out.println("running mode of");

        }

        public static void main(String[] args) {
            Testoverrding b=new Testoverrding();
            b.run();
        }


        }


