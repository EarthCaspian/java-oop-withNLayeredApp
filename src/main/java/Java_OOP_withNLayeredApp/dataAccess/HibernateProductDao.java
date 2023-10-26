package Java_OOP_withNLayeredApp.dataAccess;

import Java_OOP_withNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır...SQL
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
