package StringDemo;

public class StringDemoP01 {

    public static void main(String[] args) {
        String s1=new String("Ashwani");
        String s2="Ashwani";
        String s3="Ashwani";

        String s5=new String("Ashwani");

        String s6="Raj";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s5.hashCode());

    }
}
