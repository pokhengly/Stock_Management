package dao;

import models.Product;

import java.util.ArrayList;

public interface ProductDAO {

    ArrayList<Product> getAllProducts();
    Product getProductById(int produtId);
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);

    void viewProduct(Product product);

    void searchProduct(String productName);
    void displayProduct(Product product);



}
