 interface demo3 {//1st interface
    //achieve multiple inheritance by interface
    void show();

}
 interface demo4{ // 2nd interface
     void print() ;

    }
    class demotest3 implements demo4, demo3 {
    public void show(){
        System.out.println("show");
    }


        public void display() {

        }


        public void print(){
        System.out.println(" display");
    }

        public static void main(String[] args) {
            demotest3 d=new demotest3();
            d.show();
            d.print();
        }}



