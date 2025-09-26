package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //duplicate nhi ayega
        //order nhi
        //random access nhi ha
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println(set);


    }
}
