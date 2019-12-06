package adapter;

public class Main
{
    public static void main(String[] args)
    {
        NewClassAdapter newClassAdapter = new NewClassAdapter(new OldClass());
        newClassAdapter.newMethod();
    }
}