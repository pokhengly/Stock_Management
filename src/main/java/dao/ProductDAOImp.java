package dao;

import models.Product;

import java.util.ArrayList;

public class ProductDAOImp implements ProductDAO {

    private final ArrayList<Product> products = new ArrayList<>();

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

    @Override
    public void viewProduct(Product product) {
        // Implement logic to view a product

    }

    @Override
    public void searchProduct(String productName) {
        // Implement logic to search a product

    }

    @Override
    public void displayProduct(Product product) {


        // Implement logic to display a product
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Unit Price: " + product.getUnitPrice());
        System.out.println("Product Stock Quantity: " + product.getStockQuantity());
        System.out.println("Product Import Date: " + product.getImportDate());

        System.out.println("Payment: " + product.getUnitPrice() * product.getStockQuantity());


    }
}
