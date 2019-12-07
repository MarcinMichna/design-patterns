package facade;

public class Audio
{
    public String audioPath;

    public Audio(String audioPath)
    {
        this.audioPath = audioPath;
    }

    public VideoFile addAudio(VideoFile old)
    {
        System.out.println("adding audio");
        return old;
    }
}
