package proxy;

public class ProxyImage implements Image
{
    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void display()
    {
        if(realImage == null)
        {
            System.out.println("Creating new image");
            realImage = new RealImage(fileName);

        }
        else
        {
            System.out.println("Image already exists");
        }
        realImage.display();
    }
}
