import java.io.*;


class ExceptionDemo7
{
    public static void main(String A[]) 
    { 
      try{

      BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter Your name :");
      String name = bobj.readLine();

      System.out.println("Enter Your age :");
      int Age = Integer.parseInt(bobj.readLine());

      System.out.println(name);
      System.out.println(Age);
      
      }
      catch(Exception obj)
      {}
    }

}


