import java.io.*;


class ExceptionDemo8
{
    public static void main(String A[]) throws IOException
    { 

      BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter Your name :");
      String name = bobj.readLine();

      System.out.println("Enter Your age :");
      int Age = Integer.parseInt(bobj.readLine());

      System.out.println(name);
      System.out.println(Age);
      
      
    }

}