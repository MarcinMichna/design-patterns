package decorator;

public class Main
{
    public static void main(String[] args)
    {
        A a = new ADecorator2(new AImpl());
        a.action();
    }
}
