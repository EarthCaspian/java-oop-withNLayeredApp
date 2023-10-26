package Java_OOP_withNLayeredApp.business;

import Java_OOP_withNLayeredApp.core.logging.Logger;
import Java_OOP_withNLayeredApp.dataAccess.JdbcProductDao;
import Java_OOP_withNLayeredApp.dataAccess.ProductDao;
import Java_OOP_withNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;
    //private Logger[] loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }


    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
        }
        productDao.add(product);

        for (Logger logger: loggers) { // [db,file]
            logger.log(product.getName());
        }
    }
}
