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

class DerivedX extends Derived {
    public int P,Q;

    public DerivedX()
    {
     System.out.println("Inside DerivedX constructor");
    }
    public void Sun()
    {
     System.out.println("Inside Sun function");
 
    }


}
class MultiLevel {
    public static void main(String Arg[])
    {
        System.out.println("Inside main function");
         DerivedX dobj = new DerivedX();
         dobj.Fun();
         dobj.Gun();
         dobj.Sun();
    }
}
