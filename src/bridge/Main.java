package bridge;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.make();
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.make();
    }
}
