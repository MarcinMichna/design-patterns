package decorator;

public class ADecorator implements A
{
    protected A wrap;

    public ADecorator(A wrap)
    {
        this.wrap = wrap;
    }

    @Override
    public void action()
    {
        System.out.println("ADecorator action method");
        wrap.action();
    }
}
