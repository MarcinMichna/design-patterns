package state;

public class TvOffState implements State
{
    @Override
    public void doAction()
    {
        System.out.println("Tv i OFF");
    }
}
