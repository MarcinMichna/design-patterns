package visitor;

public class ElementImpl implements Element
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
