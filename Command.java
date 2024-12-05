class Command
{
    public static void main(String A[])
    {
        System.out.println("Number of Command line argument are :"+A.length);

        for(int i = 0 ; i < A.length ; i++)
        {
            System.out.println(A[i]);
        }
    }
}