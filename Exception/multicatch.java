//only first exception will excecute(multiple catch)
public class multicatch {
    static void m() {
        try {
            int i = 50 / 0;
            System.out.println(i);//arithmatic
            int arr[] = new int[3]; //arraay index bound
            arr[5] = 25;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("srikanta");
        }
    }
    public static void main(String[] args) {
        m();
    }
    }

