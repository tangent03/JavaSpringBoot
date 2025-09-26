package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal=1000;
    private final ReentrantLock rl =new ReentrantLock();

    //1.5 sync
    public void withdraw(String threadName,int amount)
    {
        System.out.println(threadName + " is trying to withdraw "+amount);
        //rl.lock(); //
        if(rl.tryLock())
        {
            rl.lock();
            try {
                System.out.println(threadName+ " acquired lock");
                if(bal>=amount)
                {
                    Thread.sleep(2000);
                    bal=bal-amount;
                    System.out.println("withdrawn : "+amount+ " remaining : "+bal);
                }
                else {
                    System.out.println("insufficient balance");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                rl.unlock();
            }
        }
        else {
            System.out.println(threadName+ " let me do some other task......");
        }

    }
}
