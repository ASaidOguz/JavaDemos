public class Product {

    public Product(int _id,String _name,String _description,double _price){
        System.out.println("Yapıcı blok çalıştı!!");
        this._id=_id;
        this._name=_name;
        this._description=_description;
        this._price=_price;
    }




    //Attribute veya field olmaktadır.
    // fieldlar _ ile başlar
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    //Read only getId fonksiyonu!!
    public int getId(){
        //you may mutate the id somehow if u desire!!
        return _id;
    }
    //this şu an bulunduğum classın yerini tutar yani

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_StockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }
}
