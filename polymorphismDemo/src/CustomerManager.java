public class CustomerManager {
    private BaseLogger _baselogger;
    public CustomerManager(BaseLogger logger){
        this._baselogger=logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        this._baselogger.log("Mesaj Loglandı");
    }


}
