package org.example;

import dao.ProductDAO;
import dao.ProductDAOImp;
import models.Product;

public class Main {
    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAOImp();
        Product product = new Product();
        productDAO.displayProduct(product);

    }
}