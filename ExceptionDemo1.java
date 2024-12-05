import java.util.*;

class ExceptionDemo1
{
    public static void main(String A[])
    {   int iNo1 = 0, iNo2 = 0, iAns = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        iNo1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        iNo2 = sc.nextInt();

        
        iAns = iNo1 / iNo2;

        System.out.println("Division is :"+iAns);

    }

}