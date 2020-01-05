package state;

public class TvOnState implements State
{
    @Override
    public void doAction()
    {
        System.out.println("Tv is ON");
    }
}
