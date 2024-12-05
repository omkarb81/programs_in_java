class Arithmetic {
    public int addition(int A, int B) {
        return A + B;
    }

    public int addition(int A, int B, int C) {
        return A + B + C;
    }

    public float addition(float A, float B) {
        return A + B;
    }
}

class Overloading { 
    public static void main(String args[]) { 
        Arithmetic aobj = new Arithmetic(); 

        System.out.println(aobj.addition(10, 20));
        System.out.println(aobj.addition(10, 20, 30));
        System.out.println(aobj.addition(10.0f, 20.89f));
    }
}
