package core.logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Veri Maillogger'a loglandı: "+data);
    }
}
