/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author lixi3350
 */
public class Product {
    private Integer productID;
    private String productName;
    private String description;
    private String category;
    private double price;
    private Integer quantity;

    public Product(Integer productID, String productName, String description, String category, double price, Integer quantity) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "ID:" + productID + ", Name:" + productName+ "}";//+ ", description=" + description + ", category=" + category + ", price=" + price + ", quantity=" + quantity + '}';
    }

    
    
    
}
