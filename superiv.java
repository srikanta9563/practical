 //instance variable
class Shape {//parent class
    String name="circle";}// data member is parent class
class size extends Shape{ //child class
    String name= "Triangle";//data member of child class
    void displayname() { //method
        System.out.println(name);// display the name of the child class
        System.out.println(super.name);// display the name of the shape class

    }}
class superiv{
    public static void main(String[] args) {
        size s=new size();
        s.displayname();
    }
}







