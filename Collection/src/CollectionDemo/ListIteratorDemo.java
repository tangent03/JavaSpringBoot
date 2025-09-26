package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Java","DSA","Python","DevOps"));
        ListIterator<String> li= list.listIterator();
        System.out.println("Forward Dir");

        while (li.hasNext())
        {
            String data=li.next();
            System.out.println(data);
            if(data.equals("Python"))
            {
                li.set("React");
            }
        }

        System.out.println("backward dir");
        while (li.hasPrevious())
        {
            System.out.println(li.previous());
        }

        System.out.println(list);
    }
}
