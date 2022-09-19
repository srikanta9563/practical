public abstract class abstractnew {//parent class
    //an abstract class which has abstract non abstract and constractor
    abstractnew(){//constractor
        System.out.println("constractor created");
    }

    abstract void show();// abstract method
         void method1(){//non abstract method
             System.out.println("method 1 created");



    }}
    class anything extends abstractnew {//child class
        @Override
        void show() {
            System.out.println("Srikanta");
        }




        public static void main(String[] args) {
             abstractnew obj=new anything();
            obj.method1();
            obj.show();
        }
    }

