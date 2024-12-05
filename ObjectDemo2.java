class ObjectDemo2
{
    public static void main(String A[])
    {
        String s1 = "Marvellous"; 
        String s2 = "PPA"; 
        String s3 = "Marvellous";

        String s4 = new String("Marvellous");
        String s5 = new String("Marvellous");

        System.out.println(s1.hashCode()); 
        System.out.println(s2.hashCode()); 
        System.out.println(s3.hashCode()); 
        System.out.println(s4.hashCode()); 
        System.out.println(s5.hashCode()); 
    }
}