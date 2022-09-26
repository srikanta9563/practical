// return an array from the method
public class arrayex4 {
    //creating method which returns the array
    static int[]printarray(){
        return new int[]{20,30,40,50};// anonymous array
    }

    public static void main(String[] args) {
        //calling method
        int a[]=printarray();
//traversing the array
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);

    }}}

