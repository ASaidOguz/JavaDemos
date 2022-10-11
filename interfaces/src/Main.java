public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        //Losely coupled yani bağımlılıkları azaltıp daha rahat yeni içeriklerin oluşturabilmek için
        //interfaceler kullanılır...
        //Bir class birden fazla interface i implemente edilebilir.
        //Diğer yaptıgım methodda çalıştı ama classın içinde bir değişim
        //bağımlılık yarattığı için uygulama hatası oluştu.
        CustomerManager customerManager=new CustomerManager(new SqlCustomerDal());
        customerManager.add();
    }
}