package oppWithEnlayerdApp.core.logging;

public class DataBaselogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veri tabanına loglandı!!"+data);
    }
}
