/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lixi3350
 */
public class Order {
    private Integer orderID;
    private Integer date;
    Collection<OrderItem> items = new ArrayList<>();
    private Customer customer;

     public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(Collection<OrderItem> items) {
        this.items = items;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public Integer getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }
    
    public Order(Integer orderID, Integer date, Customer customer) {
        this.orderID = orderID;
        this.date = date;
        this.customer = customer;
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
      
    //LAB02 count all the items
    public void addItem(OrderItem orderItem){
        items.add(orderItem);
    }

}
