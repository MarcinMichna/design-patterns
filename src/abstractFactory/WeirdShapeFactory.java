package abstractFactory;

public class WeirdShapeFactory extends AbstractFactoryShape
{
    @Override
    public Shape getShape(String shape)
    {
        if(shape.equals("square")) return new WeirdSquare();
        else if(shape.equals("circle")) return new WeirdCircle();
        return null;
    }
}
