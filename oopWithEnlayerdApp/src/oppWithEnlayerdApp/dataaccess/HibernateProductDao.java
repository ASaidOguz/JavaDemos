package oppWithEnlayerdApp.dataaccess;

import oppWithEnlayerdApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //Sadece ve sadece DB erişim kodları buraya yazılır.
        System.out.println("Hibernate ile veri tabanına eklendi!!");
    }
}
