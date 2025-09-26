package Sync;

public class MyThread1 extends Thread{
    TablePrntWithMethod t;
    MyThread1(TablePrntWithMethod t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
