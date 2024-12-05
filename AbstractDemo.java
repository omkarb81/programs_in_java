abstract class Arithmatic
{
    abstract public int Addition(int A , int B);
    abstract public int Substraction(int A , int B);
     public int Multiplication(int A , int B)
     {
        return (A * B);
     }
}

class Marvellous extends Arithmatic
{
    public int Addition(int A , int B)
    {
        return A+B;
    }
    public int Substraction(int A , int B)
    {
        return A-B;
    }
}

class AbstractDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();

        System.out.println(mobj.Addition(10,11));
        System.out.println(mobj.Substraction(11,2));
        System.out.println(mobj.Multiplication(10,11));

    }
}