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
public class Order {
    private Integer orderID;
    private Integer date;

    public Integer getOrderID() {
        return orderID;
    }

    public Integer getDate() {
        return date;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public void setDate(Integer date) {
        this.date = date;
    }
    
    public double getTotal(){
        double total=0;

        for (OrderItem item : purchasedItem) {
            total += item.getItemTotal();
        }
        System.out.print(total);
        return total;
        
        }
    
    public 
}
