package factory;

public class Main
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");

        circle.draw();
        square.draw();
    }
}
