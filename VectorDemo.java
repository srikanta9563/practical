import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {//main method
        //creating object
        Vector<String> vc = new Vector<>(4);
        //adding elements
        vc.add("dog");
        vc.add("cat");
        vc.add(0,"tiger");
        vc.add("lion");
        vc.add("cow");
        vc.add("goat");

//checking size and capacity
        System.out.println("size: "+vc.size());
        System.out.println("capacity: "+vc.capacity());

        //checking elements
        System.out.println(vc);
        if(vc.contains("cat")) {	//logic
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
        //getting 1st element
        System.out.println("1st element - "+vc.firstElement());
        //getting last elemnt
        System.out.println("last element - "+ vc.lastElement());
        //checking specific element
        System.out.println(" index- "+ vc.indexOf("cat"));
    }
}