class PackageDemo{
    public static void main(String[] args) 
    {
         float Ans =0.0f;

        Square sobj = new Square();
        Ans = sobj.SquareArea(10.5f);

        System.out.println("Area of Square is :"+Ans);
    }
}