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
    private Integer ProductID;
    private String productName;
    private String description;
    private String category;
    private double price;
    private Integer quantityInStock;

    public void setProductID(Integer ProductID) {
        this.ProductID = ProductID;
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

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Integer getProductID() {
        return ProductID;
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

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", productName=" + productName + '}';
    }
    
    
}
