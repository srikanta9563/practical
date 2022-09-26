//anonymous array in java
public class arrayex3 {
    public static void main(String[] args) {
        display(new int[]{10,20,30,40});//passing anonymus of array
    }
    //creating a method which receives an array as a parameter
        static void display(int a[]){ //no need to declare the array while passing an array to the method
        for(int i=0;i<=a.length-1;i++)
            System.out.println(a[i]);
    }
}
