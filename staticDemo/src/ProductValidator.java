public class ProductValidator {
    //Araç amacıyla kullanılan yapılarda static keyword ü kullanabiliriz
    //Böylece ektstradan new instance oluşturmak zorunda kalmayız
    //static tanımlamalar main metot sonlanana kadar bellekten silinmez.
    //staticte constructor blok çalıştırmak için aşağıdaki gibi
    //bir syntax kullanılabilir...
    //Ana class static olamaz ama inner class olarak kullanımı mevcut...
    static{
        System.out.println("Nesne oluşturuldu!");
    }
    public static boolean isValidate(Product product){

        return product.price > 0 && !product.name.isEmpty();
    }
}
