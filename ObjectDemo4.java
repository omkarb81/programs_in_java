class Student implements Cloneable
{
    public String Name;
    public int Age;
    public int Marks;

public Student (String A , int B , int C)
    {
        this.Name = A;
        this.Age = B;
        this.Marks = C;
    }


public Object clone() throws CloneNotSupportedException
{
    return super.clone();
}
    
}


class ObjectDemo3
{
    public static void main(String A[])
    {
        try
        {
            Student sobj = new Student("Sagar",21, 89);
            Student sobj = (Student)sobj.clone();
            


            System.out.println(sobj.Name);
            System.out.println(sobj.Age);
            System.out.println(sobj.Marks);
        }
        catch (Exception obj)
        {}
        
    }
}