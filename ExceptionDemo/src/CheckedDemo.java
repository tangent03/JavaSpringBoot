import java.io.*;

public class CheckedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            //FileReader file=new FileReader("genie.txt");
            fis =new FileInputStream("genie.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file");
            System.exit(0);
        }
        finally {
            //fis.close();
            System.out.println("finalyy");
        }


    }
}
