class ArrayDemo1
{
    public static void main(String A[])
    {
        int Arr[] = {10 , 20 , 30 , 40};

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);

        System.out.println(Arr.length);

        int Arr2[] = new int[4];  //Dynamic
        Arr2[0] = 10;
        Arr2[1] = 10;
        Arr2[2] = 10;
        Arr2[3] = 10;

        System.out.println(Arr2.length);

    }
}