package Questions;

public class Q2 {
    public static void main(String[] args) {
        try {
            int x=100/0;
            System.out.println("hell div"); //1-- no
        }
        catch (ArithmeticException e)
        {
            System.out.println("exception");
        }
        System.out.println("done");
    }
}
