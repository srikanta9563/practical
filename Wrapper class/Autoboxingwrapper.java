public class Autoboxingwrapper {
    public static void main(String[] args) {
        //Autoboxing example of int to Integer
        int a=10;//primitive type
        Integer i=Integer.valueOf(a);//converting int into integer
        Integer j=a;// now complier will write integer.valueof(a) autoboxing
        System.out.println(a+" "+i+" "+j);
    }
}
