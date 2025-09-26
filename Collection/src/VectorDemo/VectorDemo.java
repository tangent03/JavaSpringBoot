package VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        Enumeration<Integer> e= vector.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
