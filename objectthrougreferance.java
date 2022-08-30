class Objectthrougref {
        //field
        int age;
        String name;
    }
    //aother clas
    class object{
        //main method
        public static void main(String[] args) {
            //initilize object by reference
// creating variable
            Objectthrougref obr =  new Objectthrougref();
            Objectthrougref obr1=  new Objectthrougref();
            Objectthrougref obr2=  new Objectthrougref();
            obr.age=22;
            obr.name="srikanta";
            obr1.age=20;
            obr1.name="sourav";
            obr2.age=25;
            obr2.name="arko";
            //print it
            System.out.println(obr.age+" "+obr .name);
            System.out.println(obr1.age+" "+obr1 .name);
            System.out.println(obr2.age+" "+obr2 .name);

        }
    }


