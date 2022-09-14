 class shape2{
    public shape2(){
        System.out.println("halu");

    }}
    class size2 extends shape2{
        size2(){
            super();
            System.out.println("hi");
        }
    }
    class superons{
        public static void main(String[] args) {
            size2 s=new size2();

        }
    }


