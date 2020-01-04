package bridge;

public class Bike extends Vehicle
{
    public Bike(Workshop work1, Workshop work2)
    {
        super(work1, work2);
    }

    @Override
    public void make()
    {
        System.out.println("making bike");
        work1.work();
        work2.work();
    }
}
