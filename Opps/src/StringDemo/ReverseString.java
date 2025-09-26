package StringDemo;

public class ReverseString {
    public static void main(String[] args) {
            String s1="abhishek";

            //loop
            for(int i=0;i<s1.length();i++)
            {
                System.out.print(s1.charAt(i));
            }

            System.out.println();
            //reverse
            for(int i=s1.length()-1;i>=0;i--)
            {
                System.out.print(s1.charAt(i));
            }
            String revString=""; //empty //kehsihba
            System.out.println();
            for(int i=s1.length()-1;i>=0;i--)
            {
                revString += s1.charAt(i);
            }
        System.out.println(revString);
    }
}
