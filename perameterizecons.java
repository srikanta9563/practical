class perameterizecons {
    int age;
    String name;
    perameterizecons(int a,String n) {
        age = a;
        name = n;
    }
    void show(){
        System.out.println(age+ " "+name);}

    public static void main(String[] args) {
        perameterizecons p=new perameterizecons(23,"srikanta");
        perameterizecons p1=new perameterizecons(23, "sourav");
        p.show();
        p1.show();


    }
    }

