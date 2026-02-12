
package com.example.main;

import com.example.dao.ProductDAO;
import com.example.model.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p = new Product(1, "Laptop", "Dell Laptop", 55000, 10);
        dao.save(p);

        Product db = dao.get(1);
        System.out.println(db.getName() + " " + db.getPrice());

        db.setPrice(50000);
        dao.update(db);

        //dao.delete(1);
    }
}
