public class Main {
    public static void main(String[] args) {
        //Overloading with constructor;
        Product product=new Product(1,"Laptop","Asus Laptop",3.500);
        product.set_id(1);
        product.set_name("Laptop");
        product.set_description("Lenovo Laptop");
        product.set_price(5.200);
        product.setStockAmount(10);
        System.out.println(product.get_description());
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}