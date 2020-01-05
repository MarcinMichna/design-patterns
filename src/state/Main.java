package state;

public class Main
{
    public static void main(String[] args)
    {
        State off = new TvOffState();
        State on = new TvOnState();

        Context context = new Context(off);
        context.doState();

        context.setState(on);
        context.doState();

    }
}
