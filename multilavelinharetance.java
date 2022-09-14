class multilavelinharetance { // parent class A
    void running(){
        System.out.println("running mood on");
    }
}
class car1 extends multilavelinharetance{ //child class B
    void run(){
        System.out.println("speed is very high");

    }

}
class Bike1 extends car1{
    void speed(){
        System.out.println("car run mood on");
    }
}
 class multilavelinharetance1 {
    public static void main(String[] args) {
        Bike1 d= new Bike1();
        d.speed();
      d.running();




    }

}


