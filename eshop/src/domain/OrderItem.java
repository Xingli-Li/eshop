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
public class OrderItem {
    private Integer quantity;
    private Integer purchasedPrice;
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = product.getQuantity();
    }

    public void setPurchasedPrice(Integer purchasedPrice) {
        this.purchasedPrice = product.getPrice();
    }
    
    public double getItemTotal(){
       return purchasedPrice*quantity;
    }
    
}
