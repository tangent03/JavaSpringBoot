public class ArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("before exception");
        try {
            //int a=10/0; //ArithmeticException--->Runtime ---> Exception
            }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally hai");
        }
        System.out.println("After handling");
    }
}
