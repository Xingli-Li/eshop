/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author lixi3350
 */
public class Order {
    private Integer orderID;
    private Integer date;
    ArrayList<OrderItem> items = new ArrayList<>();

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

    public Order(Integer orderID, Integer date) {
        this.orderID = orderID;
        this.date = date;
        items = new ArrayList<>();
    }
  
    //LAB02 get the price for all the items
    public double getTotal(){
    double total=0;
    
    for (OrderItem item : items){
        total += item.getItemTotal();
    }
    System.out.println(total);
    return total;
    }
    

       
    //LAB02 count all the items  ??????ERROR??????
    public Integer addItem(OrderItem orderItem){
        Integer row = null;
        for(OrderItem item : items){
            row +=item.getPurchasedItem();
            row++;
        }
        System.out.println(row);
        return row;
    }

}
