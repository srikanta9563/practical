public class copyconst {
    int age;
    String name;
    copyconst(int a,String n){
        age= a;
        name= n;

    }
    copyconst(copyconst c){
        age = c.age;
        name= c.name;

    }
    void show(){
        System.out.println(age+" "+name);}

    public static void main(String[] args) {
        copyconst c1=new copyconst(23,"srikanta");
        copyconst c2=new copyconst(c1);
        c1.show();
        c2.show();
    }

    }


