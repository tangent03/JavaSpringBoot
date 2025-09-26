package Custom;

public class ATM {
    public static void main(String[] args) {
            try {
                withdraw(1000,1500);
            } catch (InsufficentBalExeption e) {
                System.out.println("Exception Bal ins");
                System.out.println(e);
            }
    }

    public static void withdraw(double bal,double amt) throws InsufficentBalExeption {
        if(amt>bal)
        {
            throw new InsufficentBalExeption("Insufficient Bal : " +
                    "Available bal "+bal+ "requested "+amt);

        }
        System.out.println("withdrawal of amount "+amt+" successfull");
    }
}
