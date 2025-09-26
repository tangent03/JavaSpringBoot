package OPPs;

public class Course {
    String name; //defult value = null
    int duration;

   /* Course()
    {
        System.out.println("Constructor called...");
    }*/
    Course(String name,int duration)
    {
        System.out.println(name);
        this.name = name; //instance = local
        this.duration=duration;
        //System.out.println("Para Constructor called...");
    }


    public static void main(String[] args) {
        //System.out.println("before object create");
        Course c= new Course("Java",4);
       /* c.name="java full stack";
        System.out.println("after object create");*/

        Course c2= new Course("Devops",5);
        //c2.name="Devops";
        //c.learn(c2);

        //para
        Course c3=new Course("DSA",3);

        System.out.println(c.name);
        System.out.println(c.duration);
        System.out.println(c2.name);
        System.out.println(c2.duration);
        System.out.println(c3.name);
        System.out.println(c3.duration);

    }

    void learn(Course c)
    {
        System.out.println("we are learning "+c.name);
    }

}
