public class EmailLogger extends BaseLogger{
    public void log(String message){
//We override the baselogger !!
        System.out.println("Email logger: "+message);
    }
}
