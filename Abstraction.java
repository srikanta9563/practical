public abstract class Abstraction {
abstract void method();//abstract method


}
class Test extends Abstraction{//child class
    @Override
    void method() {
        System.out.println("Srikanta");
    }
}
class newTest extends Abstraction{
    @Override
    void method() {
        System.out.println("sourav");
    }

    public static void main(String[] args) {
        Abstraction abs=new newTest();
        abs.method();
    }
}



