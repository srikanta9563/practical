class method1 {
    String name;
    int age;

    void input(String n, int a) {// insert records method
        age = a;
        name = n;
    }
    void display() {//method 2 display result
        System.out.println(name + " " + age);
    }
}

    class method {
        public static void main(String[] args) {
            //intialized object by reference
            method1 obr1 = new method1();
            method1 obr2 = new method1();
            obr1.input("srikanta", 12);
            obr2.input("sourav", 15);
            //print it
            obr1.display();
            obr2.display();

        }
    }










