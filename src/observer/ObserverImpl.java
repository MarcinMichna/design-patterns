package observer;

public class ObserverImpl implements Observer
{
    @Override
    public void upate()
    {
        System.out.println("Observer update");
    }
}
