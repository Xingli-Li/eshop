/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.Collection;

/**
 *
 * @author lixi3350
 */
public interface ProductDAOInterface {
    Collection<Product> getProducts();
    Collection<String> getCategories();
 
    void save(Product product);
    void delete(Product selected);
    
    Product findById (int id);
    Collection<Product> findByFilter (String category);
}
