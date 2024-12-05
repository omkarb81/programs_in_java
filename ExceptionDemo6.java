import java.util.*;

class AgeInvalidException extends Exception
{
    public AgeInvalidException (String str)
    {
        super(str);
    }
}

class ExceptionDemo6
{
    public static void main(String A[])
    {   
        int Age= 0;

        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        Age = sc.nextInt();

        try {
          System.out.println("Inside Try block");
          if(Age < 18)
          { 
            AgeInvalidException aobj = new AgeInvalidException("Age is invalid");
             throw aobj;
             
          } 
        } 
          catch (AgeInvalidException obj)
          {
            System.out.println("Inside catch block");
            System.out.println(obj); 
          }
        finally{
            System.out.println("Inside finally block");

        }
            System.out.println("End application");

    }

}