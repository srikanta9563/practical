
import java.util.Scanner;



class whiletest {
    public static void main(String[] args) {
        int sum = 0;
        //Scanner class
        Scanner input = new Scanner(System.in);
        //take inpiut from user
        System.out.println("enter the numbers");
        int number = input.nextInt();
        while (number > 0) {
        // add only posituve numbers
        sum += number;
        System.out.println("enter the numbers");
        number = input.nextInt();
    }
        System.out.println("sum is:" +sum);




    }
}
