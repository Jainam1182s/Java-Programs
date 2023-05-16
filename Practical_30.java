/* Question := Write a program to generate customized exception named ArgumentGreaterThanOne if there is 
               more than one argument in command line. */
 
import java.lang.Exception;
class ArgumentGreaterThanOne extends Exception {
    ArgumentGreaterThanOne(String e){
        super(e);
    }
}

public class Practical_30 {
    public static void main(String[] args) throws ArgumentGreaterThanOne {
        try{
            if(args.length > 1) {
                throw new ArgumentGreaterThanOne("More Than One Command Line Input Not Allowed.");
            }
            else {
                System.out.println("Program is running Successfully.");
            }
        }
        catch(ArgumentGreaterThanOne e)
        {
            System.out.println(e);
        }
    }
}

/* Output := 
        Program is running Successfully.
*/

//Practical-30 And Practical-32 Are Same...
