package core.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Veri Filelogger'a loglandı: "+data);
    }
}
