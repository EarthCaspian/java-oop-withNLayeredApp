package Java_OOP_withNLayeredApp;

import Java_OOP_withNLayeredApp.business.ProductManager;
import Java_OOP_withNLayeredApp.core.logging.DatabaseLogger;
import Java_OOP_withNLayeredApp.core.logging.FileLogger;
import Java_OOP_withNLayeredApp.core.logging.Logger;
import Java_OOP_withNLayeredApp.core.logging.MailLogger;
import Java_OOP_withNLayeredApp.dataAccess.HibernateProductDao;
import Java_OOP_withNLayeredApp.dataAccess.JdbcProductDao;
import Java_OOP_withNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone Xr", 1500);

        //Logger[] loggers = {};
        List<Logger> loggers = new ArrayList<Logger>(List.of(new DatabaseLogger(), new FileLogger(), new MailLogger()));

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}