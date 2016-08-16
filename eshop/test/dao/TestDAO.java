/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lixi3350
 */
public class TestDAO {
    
    private static ProductDAO  dao = new ProductJdbcDAO();
    // rst test product
    private Product prodOne;
    // second test product
    private Product prodTwo;
    
    public TestDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    // first test product
    this.prodOne = new Product(1, "name1", "cat1", "desc1", 11, 22);
    // second test product
    this.prodTwo = new Product(2, "name2", "cat2", "desc2", 33, 44);
    // save the products
    dao.save(prodOne);
    dao.save(prodTwo);
    }
    
    @After
    public void tearDown() {
        dao.delete(prodOne);
        dao.delete(prodTwo);
    }
    
@Test
    public void testDaoSaveAndDelete() {
    // create product for testing
    Product savedProd = new Product(3, "name", "desc", "cat", 1, 2);
    // save the product using DAO
    dao.save(savedProd);
    // retrieve the same product via DAO
    Product retrieved = dao.findById(3);
    // ensure that the product we saved is the one we got back
    assertEquals("Retrieved product should be the same as the saved one",savedProd, retrieved);
    // delete the product via the DAO
    dao.delete(savedProd);
    // try to retrieve the deleted product
    retrieved = dao.findById(3);
    // ensure that the student was not retrieved (should be null)
    assertNull("Product should no longer exist", retrieved);
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
