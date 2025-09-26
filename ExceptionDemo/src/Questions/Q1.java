package Questions;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Hello"); //1
        try {
            System.out.println("I am"); //2
        }
        catch (Exception e)
        {
            System.out.println("Exception"); //3
        }
        System.out.println("Done"); //4
    }
}
