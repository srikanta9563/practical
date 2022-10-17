import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplecatchException {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        try {
            int x=a.nextInt();
            int y=a.nextInt();
            System.out.println(" "+(x/y));
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}
