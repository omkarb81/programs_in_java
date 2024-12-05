import java.util.*;

class ExceptionDemo3
{
    public static void main(String A[])
    {   int iNo1 = 0, iNo2 = 0, iAns = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        iNo1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        iNo2 = sc.nextInt();

        try{
        System.out.println("Inside try block");
        iAns = iNo1 / iNo2;
        }
        catch()
        {
            System.out.println("Inside catch block");
        }
        finally
        {
            System.out.println("Inside finally block")
        }

        System.out.println("Division is :"+iAns);

    }

}