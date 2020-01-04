package visitor;

public class VisitorImpl implements Visitor
{
    @Override
    public void visit(Element element)
    {
        System.out.println("Visited element");
    }
}
