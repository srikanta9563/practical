public class singleinheretance {
    void running() { // parent class A
        System.out.println("running mode on");
    }}
    class Bike extends singleinheretance{ //child class b
    void run(){
        System.out.println("bike run mode on");

        }}
class singleinheretance1{
    public static void main(String[] args) {
        Bike d= new Bike();// obejct child class bike
        d.run();// child class method
        d.running();// parent class method
    }


}



