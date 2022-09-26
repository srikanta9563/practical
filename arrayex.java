public class arrayex {
    public static void main(String[] args) {
        /*int a[] = new int[3];//decleartion array and object creation
        a[0] = 10;//intialization the memory location
        a[1] = 3;
        a[2] = 40;
        //treversing array
        int i;*/
        int a[] = {10, 20, 30,40};//intialized decleartion and object creation

        for (int i = 0; i <=a.length; i++)
            System.out.println(a[i]);
            //treversing array using foe each loop
            for(int i:a)
                System.out.println(a[i]);

    }


}
