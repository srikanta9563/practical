import java.util.Scanner;

public class userdefinedmethod {
    public static void main(String[] args) {
        // create scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        //1st input
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        //2nd input
        int b = sc.nextInt();
        //method
        addition(a, b);

    }
    //calling method

    public static void addition(int a, int b) {
        //method body
     int num=a+b ;
        System.out.println("the number is"+" "+ num);



    }}


