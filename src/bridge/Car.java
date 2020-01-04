package bridge;

public class Car extends Vehicle
{
    public Car(Workshop work1, Workshop work2)
    {
        super(work1, work2);
    }

    @Override
    public void make()
    {
        System.out.println("making car");
        work1.work();
        work2.work();
    }
}
