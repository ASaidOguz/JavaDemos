public class DatabaseLogger extends BaseLogger{
    public void log(String message){
//We override the baselogger !!
        System.out.println("Database logger: "+message);
    }
}
