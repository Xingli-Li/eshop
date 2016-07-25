/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.ArrayList;

/**
 *
 * @author lixi3350
 */
public class ProductStore {
    private static ArrayList allProducts= new ArrayList();
    
    //???LAB03 tabe single products and add it to the arrayList
    public void save(Product product){
    allProducts.add(product);
    }
    
    public ArrayList getProduct(){
    return allProducts;
    }
}
