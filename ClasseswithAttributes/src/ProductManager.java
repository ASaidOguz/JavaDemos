public class ProductManager {
    public void Add(Product product){
        System.out.println(String.format("%s Ürün eklendi",product.get_name()));
    }
}
