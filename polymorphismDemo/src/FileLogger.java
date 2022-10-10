public class FileLogger extends BaseLogger{

    public void log(String message){
//We override the baselogger !!
        System.out.println("File logger: "+message);
    }
}
