package singleton;

public class Singleton
{
    private static Singleton singleton;

    private Singleton() {}

    static Singleton getInstance()
    {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public void method()
    {
        System.out.println("singleton method");
    }

}
