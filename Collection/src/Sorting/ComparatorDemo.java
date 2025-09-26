package Sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>();
        students.add(new Student(1,"Abhay",78));
        students.add(new Student(3,"Balu",8));
        students.add(new Student(11,"Arcahna",97));
        students.add(new Student(44,"Zurawar",99));


        System.out.println(students);

        Comparator<Student> byroll =(s1,s2) ->s1.roll -s2.roll;
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName)
                .thenComparing(Student::getRoll);


    }
}
