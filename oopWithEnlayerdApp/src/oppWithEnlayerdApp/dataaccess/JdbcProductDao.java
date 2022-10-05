package oppWithEnlayerdApp.dataaccess;

import oppWithEnlayerdApp.entities.Product;

//Data acces object;
public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //Sadece ve sadece DB erişim kodları buraya yazılır.
        System.out.println("JBDC ile veri tabanına eklendi!!");
    }
}
