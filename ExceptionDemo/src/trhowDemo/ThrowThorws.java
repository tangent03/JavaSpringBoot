package trhowDemo;

public class ThrowThorws {
    public static void main(String[] args) {
        try{
            checAgeCal(-1);
        }
        catch (Exception e)
        {
            System.out.println("check failed : "+e.getMessage());
        }

    }

    public static void checAgeCal(int age) throws Exception
    {
        if(age<0)
        {
            throw new Exception("Age cannot be negative");
        }
        if(age<18)
        {
            throw new Exception("you are underage");
        }
    }
}
