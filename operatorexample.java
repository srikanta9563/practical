public class operatorexample {
    public static void main(String[] args) {
        int a=10;
        int b =20;
        int c = a+b;
        int d = a-b;
        int e = a/b;
        int f = a*b;


        System.out.println("The two numbers are:"+a+","+b);

        System.out.println("the sum is "+ c);//addition
        System.out.println("the substraction is "+ d);//substracion
        System.out.println("the divison is "+ e);//division
        System.out.println("the multiplicaton is "+ f);//multipication

        //use unaryoperator

        System.out.println(a++ + ++a);
        System.out.println(b++ + ++b);

        //use logicaloperator

        System.out.println(a<b&&b>a);
        System.out.println(a>b||b>a);



    }
}
