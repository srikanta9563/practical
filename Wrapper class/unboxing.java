public class unboxing {
    //Unboxing example of Integer to int
    public static void main(String[] args) {
        Integer a=new Integer(2);
        Integer i=a.intValue();//coverting interger into int
        Integer j=a;//now compliler will write int.value()unboxing
        System.out.println(a+" "+i+" "+j);
    }
}
