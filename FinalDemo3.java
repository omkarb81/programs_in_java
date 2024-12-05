class Base{
    public int No1 ;
    final public int No2;

    public Base(int A , int B)
    {
        No1 = A;
        No2 = B;
    }
}

class FinalDemo3
{
    public static void main(String A[])
    {
        Base bobj = new Base(11,21);

        System.out.println("Value No1 :"+bobj.No1);
        System.out.println("Value No2 :"+bobj.No2);

    }
}