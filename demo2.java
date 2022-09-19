public interface demo2 { //interface declaration
    void display();

}
class demotest implements demo2{ //1st implements
    public void display(){
        System.out.println("sourav");
    }
}

class demotest1 implements demo2{ //2nd implements
    public void display(){
        System.out.println("srikanta");
    }


    public static void main(String[] args) {
        demo2 m=new demotest1();
       // demo2 n=new demotest();
                m.display();
              //  n.display();
    }}
