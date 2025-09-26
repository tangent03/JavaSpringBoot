public class NullPointerDemo {
    public static void main(String[] args) {
        String s=null;
        try {
            int length = s.length();
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }

        //Exception mismatch
    }
}
