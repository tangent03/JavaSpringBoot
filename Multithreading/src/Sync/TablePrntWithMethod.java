package Sync;

public class TablePrntWithMethod {
    public synchronized void printTable(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " : "+(n * i));
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
