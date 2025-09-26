package LockDemo;

public class Driver {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        Runnable t1=()->account.withdraw("wife",10000);
        Runnable t2=()->account.withdraw("papa",500);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
