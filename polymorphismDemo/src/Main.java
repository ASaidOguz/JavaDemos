public class Main {
    //Polymorphism çok biçimcilik anlamına gelir...
    //Classes in java is overridble by default..
    //It means that virtual by default...
    public static void main(String[] args) {

    //Yapılan arrayin classı baselogger ve diğer logger classları baseloggerdan inherit etmekte
    //işte bu yüzden logger classı baselogger olmak zorundaki diğer tüm classları kapsasın.
    //   BaseLogger[]loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
    //    for(BaseLogger logger:loggers){
    //        logger.Log("Log mesajı!!");
    //    }

        CustomerManager customerManager=new CustomerManager(new FileLogger());

        customerManager.add();

    }
}