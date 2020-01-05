package prototype;

public class Square extends Shape
{

    public Square()
    {
        super.setType("Square");
    }

    @Override
    void draw()
    {
        System.out.println("Square::draw() method, type: " + super.getType());
    }
}
