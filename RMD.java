class Base{
   public int A, B;

   public void Fun()
   {
    System.out.println("Inside Base Fun ");
   }
   public void Gun()
   {
    System.out.println("Inside Base Gun ");
   }
   public void Sun()
   {
    System.out.println("Inside Base Sun ");
   }
   public void Run()
   {
    System.out.println("Inside Base Run ");
   }

}


class Derived extends Base {
    public int A, B;

    public void Fun()
   {
    System.out.println("Inside Derived Fun ");
   }
   public void Sun()
   {
    System.out.println("Inside Derived  Sun ");
   }
   public void Mun()
   {
    System.out.println("Inside Derived Mun ");
   }
   public void Gun()
   {
    System.out.println("Inside Derived Gun ");
   }


}
class RMD {
    public static void main(String Arg[])
    {
        System.out.println("Inside main function");
         Base bobj = new Derived();

         bobj.Fun();
         bobj.Gun();
         bobj.Sun();
         bobj.Run();
         //bobj.Mun();
         //bobj.Bun();
    }
}
