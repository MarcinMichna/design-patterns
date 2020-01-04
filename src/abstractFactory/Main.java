package abstractFactory;

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactoryShape normalShapesFactory = FactoryProducer.getFactory(false);
        AbstractFactoryShape weirdShapesFactory = FactoryProducer.getFactory(true);

        Shape normalCircle = normalShapesFactory.getShape("circle");
        Shape weirdCircle = weirdShapesFactory.getShape("circle");

        normalCircle.draw();
        weirdCircle.draw();
    }
}
