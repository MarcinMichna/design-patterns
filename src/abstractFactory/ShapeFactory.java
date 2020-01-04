package abstractFactory;


public class ShapeFactory extends AbstractFactoryShape
{
    public Shape getShape(String shape)
    {
        if(shape.equals("square")) return new Square();
        else if(shape.equals("circle")) return new Circle();
        return null;
    }
}
