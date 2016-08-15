/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Objects;

/**
 *
 * @author lixi3350
 */
public class Product implements  Comparable<Product>{
    private Integer id;
    private String name;
    private String description;
    private String category;
    private Integer price;
    private Integer quantity;

    public Product(Integer productID, String productName, String description, String category, Integer price, Integer quantity) {
        this.id = productID;
        this.name = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "ID:" + id + ", Name:" + name+ "}";//+ ", description=" + description + ", category=" + category + ", price=" + price + ", quantity=" + quantity + '}';
    }

    //LAB04 tell sorted collections how to sort the objects
    @Override
    public int compareTo(Product o) { 
        Integer myID = this.getId();
        Integer thierID = o.id;
        return myID.compareTo(thierID);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

}
