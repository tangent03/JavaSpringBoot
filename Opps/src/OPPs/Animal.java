package OPPs;

class Species
{
    void fly()
    {
        System.out.println("flying....");
    }

}



public class Animal extends Species {

    void eat()
    {
        System.out.println("Animal is eating....");
    }
    static void sound()
    {
        System.out.println("making sound treeee treeee");
    }

    @Override
    void fly() {
        System.out.println("not supported");
    }
}
class Dog extends Animal
{

    static void sound() {
        System.out.println("bark...");
    }
}
