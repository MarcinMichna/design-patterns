package decorator;

public class ADecorator2 extends ADecorator
{
    public ADecorator2(A wrap)
    {
        super(wrap);
    }

    @Override
    public void action()
    {
        System.out.println("ADecorator2 action method");
        super.action();
    }
}
