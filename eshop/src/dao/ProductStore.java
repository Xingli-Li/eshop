/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lixi3350
 */
public class ProductStore {
    private static ArrayList<Product> allProducts = new ArrayList();
    private static Collection<String> allCategories = new ArrayList();
    
    
    //LAB03 take single product and add it to the arrayList
    public void save(Product product){
    allProducts.add(product);
    allCategories.add(product.getCategory());
    }
    
    
    //LAB03 return the new field in the new getProduct method
    public ArrayList<Product> getProducts() {
        return allProducts;
    }

    public Collection<String> getCategories() {
        return allCategories;
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
    
    //Project page5: ??????????ERROR cannot find output product
    public Collection<String> findByFilter(String category) {
        return allCategories.get(category); 
    }

    
}
