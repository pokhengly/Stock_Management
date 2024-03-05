package dao;

import models.Product;

import java.util.ArrayList;

public interface ProductADO {

    ArrayList<Product> getAllProducts();
    Product getProductById(int produtId);
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);


}
