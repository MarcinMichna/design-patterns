package observer;

import java.util.ArrayList;

public class Subject
{
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void someEvent()
    {
        observers.forEach(Observer::upate);
    }
}
