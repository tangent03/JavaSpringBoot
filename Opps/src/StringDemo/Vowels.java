package StringDemo;

public class Vowels {
    public static void main(String[] args) {
        String s1="ashwani";
        int v=0,c=0;

        for(char c1:s1.toCharArray())
        {
            if("aeiou".indexOf(c1)!=-1)
            {
                v++;
            }
            else{
                c++;
            }
        }

        System.out.println("vowel count = "+v);
        System.out.println("consonant count = "+c);
    }
}
