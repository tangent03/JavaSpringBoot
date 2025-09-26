public class ExceptionInDepth {
    public static void main(String[] args) {
           m1();
        System.out.println("hello ji main");
    }

    public static void m1()
    {
        m2();
        System.out.println("Hello ji m1");
    }

    public static void m2()
    {
        m3();
        System.out.println("Hello ji m2");
    }

    public static void m3()
    {
        System.out.println(10/0);
        System.out.println("Hello ji m3");
    }
}
