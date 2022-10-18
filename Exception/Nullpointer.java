public class Nullpointer {
    int a=10;
   // public static Nullpointer x(){//null method
     //   return null;}
       //String str=null;//string null value
      //  int arr[]=null; //array object null
        String Convert(String s) {
            return s.toUpperCase();
        }

    public static void main(String[] args) {
            Nullpointer obj=new Nullpointer();
       // Nullpointer obj=Nullpointer.x();
      //  System.out.println(obj.Convert("Srikanta"));
        System.out.println(obj.Convert(null));
    }
        }


