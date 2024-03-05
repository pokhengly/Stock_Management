package models;

import java.time.LocalDate;

public class Product {

    private static int nextID = 1;
    private int id;
    private String name;
    private double unitPrice;
    private int stockQuantity;
    private LocalDate importDate;

    public Product(String name, double unitPrice, int stockQuantity, LocalDate importDate) {
        this.id = nextID++;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
        this.importDate = importDate;
    }

    public Product() {
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Product.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }
}
