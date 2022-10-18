//custom Exception
class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}
public class InvalidAgeException {
    public void checkAge(int age)throws CustomException{
        if (age<=20||age>=30) {
            throw new CustomException("ellgible");
        }
        else System.out.println("not ellgible");
        }

    public static void main(String[] args) throws CustomException{
        InvalidAgeException a=new InvalidAgeException();
        a.checkAge(21);

    }
    }
