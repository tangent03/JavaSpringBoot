package OPPs;

public class Student {
    String name;
    int age;
    String course;

    Student()
    {
        this("Unknown",0);
    }

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Ayush",12);
        s2.studentDetails();
        s1.studentDetails();

    }

    void studentDetails()
    {
        System.out.println("name "+name +" age "+age);
        hello(this); // this will rep here as default const
    }

    void hello(Student s)
    {
        System.out.println("hello "+s.name);
    }
}
