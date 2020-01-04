package observer;

public class Main
{
    public static void main(String[] args)
    {
        Subject subject = new Subject();
        subject.addObserver(new ObserverImpl());
        subject.someEvent();
    }
}