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
public class ProductStore implements ProductDAO {

    private static HashMap<Integer, Product> allProducts = new HashMap();
    private static HashMap<String, Collection<Product>> allCategories = new HashMap();

    //LAB04
    @Override
    public void save(Product product) {

        allProducts.put(product.getId(), product);

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
    @Override
    public Collection<Product> getProducts() {
        return allProducts.values();
    }

    @Override
    public Collection<String> getCategories() {
        return allCategories.keySet();
    }

    //Project page5 Test Pass
    @Override
    public Product findById(int productID) {
        return allProducts.get(productID);
        
        /*if (allProducts.isEmpty()) {
            return null;
        }
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getProductID() == id) {
                return allProducts.get(i); //found it
            } else {
                return null;
            }
        }
        return null;*/
    }

    //Project page5 Doesn't work at for second time
    @Override
    public Collection<Product> findByFilter(String category) {
        return allCategories.get(category);
    }

    @Override
    public void delete(Product selected) {
        allProducts.remove(selected.getId());

    }


}
