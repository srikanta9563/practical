public class ovveridingeg {
    int mark() {
        return 0;
    }}
    class comp extends ovveridingeg{
        int mark() {
            return 80;

    }


    }
class Eng extends ovveridingeg{
    int mark(){
        return 90;
    }
}
class Science extends ovveridingeg{
    int mark(){
        return 70;

    }}

class Exam{


    public static void main(String[] args) {

        comp c = new comp();
        Eng E = new Eng();
        Science s= new Science();


       // int result=c.mark();
        System.out.println("coumputer markes is "+c.mark());
        s.mark();
        E.mark();


    }}

