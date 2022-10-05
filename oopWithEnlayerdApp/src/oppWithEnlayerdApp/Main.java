package oppWithEnlayerdApp;
//JBDC
//Hibernate-orm
//JPA

import oppWithEnlayerdApp.business.ProductManager;
import oppWithEnlayerdApp.core.logging.DataBaselogger;
import oppWithEnlayerdApp.core.logging.Filelogger;
import oppWithEnlayerdApp.core.logging.Logger;
import oppWithEnlayerdApp.core.logging.MailLogger;
import oppWithEnlayerdApp.dataaccess.JdbcProductDao;
import oppWithEnlayerdApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product=new Product(1,"Iphone xr",10000);

        Logger[]loggers={new DataBaselogger(),new Filelogger(),new MailLogger()};

        ProductManager productManager=new ProductManager(new JdbcProductDao(), List.of(loggers));
        productManager.add(product);
    }
}