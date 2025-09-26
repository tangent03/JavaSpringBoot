
class YieldThread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " --- "+i);
            Thread.yield();
        }
    }
}


public class YieldDemo {
    public static void main(String[] args) {
        YieldThread t1=new YieldThread();  //main-5 t1-5 t2-5
        YieldThread t2=new YieldThread();

        t1.start();
        t2.start();

    }
}
