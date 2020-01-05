package chainOfResponsibility;

public class Main
{
    public static void main(String[] args)
    {
        AbstractLogger logger = new FileLogger(2);
        AbstractLogger consoleLogger = new ConsoleLogger(3);
        logger.setNextLogger(consoleLogger);

        logger.logMessage(1, "1");
        logger.logMessage(2, "2");
        logger.logMessage(3, "3");
    }
}
