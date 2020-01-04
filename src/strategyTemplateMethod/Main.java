package strategyTemplateMethod;

public class Main
{
    public static void main(String[] args)
    {
        Strategy strategy= new Impl();
        strategy.sort();
    }
}
