package OPPs;

public class Car {

    //fields , attributes, properties
    String color;
    String brand;
    int speed;  //instance

    public static void main(String[] args) {
        Car car1=new Car();

        //we need to set speed value
        //car1.speed=100;
        car1.run();


    }

    //behaviour(methods) //actions
    public void run()
    {
        System.out.println("Car is running at "+speed);
    }


}
