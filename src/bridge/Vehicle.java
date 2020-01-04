package bridge;

public abstract class Vehicle
{
    protected Workshop work1;
    protected Workshop work2;

    public Vehicle(Workshop work1, Workshop work2)
    {
        this.work1 = work1;
        this.work2 = work2;
    }

    abstract public void make();
}
