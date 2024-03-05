package dao;

import models.Product;
import java.util.ArrayList;

public class ProductDAO implements ProductADO{

    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int produtId) {
        return null;
    }

    @Override
    public void insertProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        // Implement logic to update a product

    }

    @Override
    public void deleteProduct(int productId) {
        // Implement logic to update a product

    }
}
