import java.util.ArrayList;

public class unboxingarray {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<Integer>();
        //autoboxing
        a1.add(5);
        a1.add(2);
        System.out.println("arraylist "+a1);
        //unboxig
        int a= a1.get(0);//5 Integer covert to int
        System.out.println("value of index 0 "+a);
    }
}
