package LambdaDemo;

public class Test {
    public static void main(String[] args) {
       /* ThreadB t= new ThreadB();
        t.start();*/

        Runnable task = ()-> {
            for(int i=0;i<5;i++)
            {
                System.out.println("hello...");
            }
        };
        new Thread(task).start();

        for (int i=0;i<5;i++)
        {
            System.out.println("main...");
        }
    }
}
