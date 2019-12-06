package adapter;

public class NewClassAdapter
{
    private OldClass oldClass;

    public NewClassAdapter(OldClass oldClass)
    {
        this.oldClass = oldClass;
    }

    public void newMethod()
    {
        oldClass.oldMethod();
    }
}
