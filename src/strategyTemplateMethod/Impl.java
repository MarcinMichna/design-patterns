package strategyTemplateMethod;

public class Impl extends TemplateMethod
{
    @Override
    protected void start()
    {
        System.out.println("starting");
    }

    @Override
    protected void stop()
    {
        System.out.println("ending");
    }
}
