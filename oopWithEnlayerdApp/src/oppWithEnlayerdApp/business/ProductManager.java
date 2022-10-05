package oppWithEnlayerdApp.business;


import oppWithEnlayerdApp.core.logging.Logger;
import oppWithEnlayerdApp.dataaccess.ProductDao;
import oppWithEnlayerdApp.entities.Product;

import java.util.List;
//Bir katman başka katman ile iletişimi
//sadece interface yoluyla kurmalıdır..


public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        // business rules
        if (product.getUnitPrice() < 10) {
            throw new Exception("Price cannot be less than 10.");
        }

        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
