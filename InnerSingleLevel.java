class Base{
   public int A, B;

   public Base()
   {
    System.out.println("Inside Base constructor");
   }
   public void Fun()
   {
    System.out.println("Inside Fun function");

   }

}


class Derived extends Base {
    public int A, B;

    public Derived()
    {
     System.out.println("Inside Derived constructor");
    }
    public void Gun()
    {
     System.out.println("Inside Gun function");
 
    }


}
class SingleLevel {
    public static void main(String Arg[])
    {
        System.out.println("Inside main function");
         Derived dobj = new Derived();

         dobj.Fun();
         dobj.Gun();
    }
}
