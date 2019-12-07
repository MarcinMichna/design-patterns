package facade;

public class VideoConverterFacade
{
    public VideoFile convert(String filename, String newFormat)
    {
        System.out.println("starting conversion");
        VideoFile file = new VideoFile(filename);
        if(newFormat == "mp4")
            System.out.println("nieobslugiwana konwersja");
        else
        {
            file.extension = newFormat;
            System.out.println("konwersja do " + newFormat);
        }
        Audio audioAdder = new Audio("/home/abc");
        audioAdder.addAudio(file);

        System.out.println("konwersja zakonczona");
        return file;

    }
}
