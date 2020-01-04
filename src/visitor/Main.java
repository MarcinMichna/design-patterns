package visitor;

public class Main
{
    public static void main(String[] args)
    {
        Element element = new ElementImpl();
        Visitor visitor = new VisitorImpl();

        element.accept(visitor);
    }
}
