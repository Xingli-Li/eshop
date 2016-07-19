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
    private Integer purchasedItem;
    private double purchasedPrice;

    public Integer getPurchasedItem() {
        return purchasedItem;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedItem(Integer purchasedItem) {
        this.purchasedItem = purchasedItem;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }
    
    public double getItemTotal(){
        Integer itemTotal=0;
        itemTotal += purchasedItem * purchasedPrice;
    System.out.print(itemTotal);
    }
    
}
