
class Mythread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
            Mythread t= new Mythread();
            t.start();
            //t.run()  no multithreading
            for(int i=0;i<5;i++)
            {
                System.out.println("main");
            }
    }
}
