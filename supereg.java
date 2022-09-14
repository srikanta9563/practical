 // super method
class Shape1{//parent class
    void print() {//parent class method
        System.out.println("sourav");
    }}
class name extends Shape1{// child class

    void print() { //same method of parent class(child class method)
        System.out.println("arko");}
        void display(){ //new method of child class
            System.out.println("srikanta");}
            void show(){//final method
                super.print();
                display();

    }}
        class supereg{
            public static void main(String[] args) {
                name n= new name();
                n.show();
            }
    }

