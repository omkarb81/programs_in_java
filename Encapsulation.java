class Arithamatic
{
    public int No1;
    public int No2;

    public Arithamatic()
    {
        System.out.println("Inside default constructor");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithamatic(int A , int B)
    {
        System.out.println("Inside parametrised constructor");
        this.No1 = A;
        this.No2 = B;
    }
    int Add()
    {
        int Ans=0;
        Ans = No1 + No2;
        return Ans;
    }
    int Sub()
    {
        int Ans=0;
        Ans = No1 - No2;
        return Ans;
    }
}

class Encapsulation {
    public static void main(String  Arg[])
    {
        System.out.println("Inside main funation");
       Arithamatic aobj1 = new Arithamatic(); //Arithamatic *aobj1 = new Arithamatic();
       Arithamatic aobj2 = new Arithamatic(50,40);

       int Ret = 0;

       Ret = aobj2.Add();
       System.out.println("Addition is:"+Ret);

       Ret = aobj2.Sub();
       System.out.println("Subtraction is:"+Ret);
    }
}
