package factory;

public class ShapeFactory
{
    public Shape getShape(String shape)
    {
        if(shape.equals("square")) return new Square();
        else if(shape.equals("circle")) return new Circle();
        return null;
    }
}
