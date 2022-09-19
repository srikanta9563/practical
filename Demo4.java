interface class2 {//creating a interface
    //by default all methods in interface public &abstract.
    void show();

    void display();

    void print();
}
//creating abstract class that implements one of the method of the interface1
abstract class abc implements class2 {
    public void show(){
        System.out.println("srikanta");
    }
}
//creating a sub class of the abstract class that implements rest of the methods
class Demo11 extends abc {
    public void display() {
        System.out.println("sourav");
    }

    public void print() {
        System.out.println("helu");
    }
    public class app2 {

    }




    public static void main(String[] args) {
        class2 c= new Demo11();
        c.print();
        c.show();
        c.display();
    }}
