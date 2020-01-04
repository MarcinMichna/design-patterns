package abstractFactory;

public class FactoryProducer
{
    public static AbstractFactoryShape getFactory(boolean weird)
    {
        if(weird) return new WeirdShapeFactory();
        else return new ShapeFactory();
    }
}
