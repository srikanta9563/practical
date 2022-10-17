public class ExceptionExample {
    public void show() {
        String a = "srikanta";
        System.out.println(a);
        try {
            int i = 50 / 0;//arithmatic exception
            System.out.println(i);
            String s = "sourav";
            System.out.println(s.length());
            int arr[] = new int[3];
            arr[4] = 23;//array index out of bound exception

            int m = Integer.parseInt(s);
            System.out.println(m);
        } catch (Exception e) {
            System.out.println(e);
        }
        String b = "kolkata";
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
       ExceptionExample obj=new ExceptionExample();

       obj.show();
    }




        }


