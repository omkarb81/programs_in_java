import java.util.*;

class Collections
{

    public static void main(String A[])
    {
        LinkedList <Integer> lobj = new <Integer>LinkedList();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(91);

        System.out.println(lobj);
        lobj.addFirst(5);
        System.out.println(lobj);
    }
}