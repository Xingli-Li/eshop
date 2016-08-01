/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author lixi3350
 */
public class ProductStore implements ProductDAOInterface{
    private static HashMap<Integer, Product> allProducts = new HashMap();
    private static HashMap<String, Collection<Product>> allCategories = new HashMap();
    
    
    //LAB04
    public void save(Product product){
    allProducts.put(product.getProductID(), product);
        if (allCategories.containsKey(product.getCategory())) {
            allCategories.get(product.getCategory()).add(product);
        } else {
            Collection<Product> addProduct = new TreeSet<>();
            addProduct.add(product);
            allCategories.put(product.getCategory(), addProduct);
        }   
    //allCategories.add(product.getCategory());
    }
    
    
    //LAB03 return the new field in the new getProduct method
    public Collection<Product> getProducts() {
        return allProducts.values();
    }

    public Collection<String> getCategories() {
        return allCategories.keySet();
    }
 
    //Project page5: find product by search ID ????????ERROR:can only find id once 
    public Product findById(int id) { 
        if (allProducts.isEmpty()) {
            return null;
        }
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getProductID() == id) {
                return allProducts.get(i); //found it
            } else {
                return null;
            }
        }
        return null;
    }
    
    //Project page5
    public Collection<Product> findByFilter(String category) {
        return allCategories.get(category); 
    }
    
    public void delete (Product product){
    allProducts.remove(product.getProductID());
         //if (allCategories.containsKey(product.getCategory())) {
            //allCategories.get(product.getCategory()).remove(product.getProductID());
         //}
    
    }

    
}
