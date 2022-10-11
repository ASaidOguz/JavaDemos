public class ProdcutManager {
    public void add(Product product){

        if(ProductValidator.isValidate(product)){
            System.out.println("Ürün eklendi!");
        }else{
            System.out.println("Ürün geçersiz!");
        }

    }
}
