public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        Product product=new Product();
        product.name="Keyboard";
        product.id=1;
        product.price=0;

        ProdcutManager prodcutManager=new ProdcutManager();
        prodcutManager.add(product);
        //Inner class ve static class örneği...bi hayli uzun XD ve best practice olmaktan çıkar...
        DatabaseHelper.Crud.Connection.createConnection();
    }
}