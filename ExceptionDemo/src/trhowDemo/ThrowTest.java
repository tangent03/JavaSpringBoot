package trhowDemo;

public class ThrowTest {
    public static void main(String[] args) {
        try
        {
            withdraw(1000,2000);
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }

    }

    public static void withdraw(double bal,double amt) throws Exception {
        if(amt>bal)
        {
            throw new Exception("Insufficent Balance");
            /*try {
                throw new Exception("Insufficent Balance");
            }
            catch (Exception e)
            {

            }*/
        }
        System.out.println("withdrawal successful...");
    }
}
