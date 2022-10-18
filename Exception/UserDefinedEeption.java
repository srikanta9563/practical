
    // class represents user-defined exception  //under throwable class
    class UserDefinedException1 extends Exception
    {
        public UserDefinedException1(String str)
        {
            // Calling constructor of parent Exception
            super(str);
        }
    }
    // Class that uses above MyException
    public class UserDefinedEeption{

        public static void main(String args[]) {
            {try {

                // throw an object of user defined exception
                throw new UserDefinedException1("This is user-defined exception");

            }catch (UserDefinedException1 u){


                System.out.println("Caught the exception");
                // Print the message from MyException object
                System.out.println(u.getMessage());
            }
        }}}

