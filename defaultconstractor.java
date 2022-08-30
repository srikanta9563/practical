//display default value
class defaultconstractor {
   String name;
    int age;

    void show(){
        // method to display age and name
        System.out.println(age+ " "+ name);}

    public static void main(String[] args) {
        defaultconstractor d = new defaultconstractor();
        defaultconstractor d1 = new defaultconstractor();
        d.show();
        d1.show();
    }}






