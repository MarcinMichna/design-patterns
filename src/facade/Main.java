package facade;

public class Main
{
    public static void main(String[] args)
    {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.convert("abc","mp5");
    }
}
