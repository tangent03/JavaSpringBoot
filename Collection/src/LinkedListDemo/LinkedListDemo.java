package LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Raj");
        list.add("Simran");
        list.add("Aditya");
        list.add("Komal");
        list.add("rohit");

        //fetch
        String first = list.getFirst();
        String last = list.getLast();

        System.out.println("First element : "+first);
        System.out.println("First element : "+last);




    }
}
