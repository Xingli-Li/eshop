/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author lixi3350
 */
@RunWith(Parameterized.class)
public class TestDAO {
    
    private final  ProductDAO dao;// = new ProductJdbcDAO("jdbc:h2:tcp://localhost:9099/project-testing");
    // rst test product
    private Product prodOne;
    // second test product
    private Product prodTwo;
    
    public TestDAO(ProductDAO dao) {
        this.dao=dao;
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
    this.prodOne = new Product(1, "name1", "desc1", "cat1", 11, 22);
    // second test product
    this.prodTwo = new Product(2, "name2", "desc2", "cat2", 33, 44);
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
    
@Test
    public void testDaoGetAll() {
    // call getAll
    Collection<Product> products = dao.getProducts();
    // ensure the result includes the test products
    assertTrue("prodOne should exist", products.contains(prodOne));
    assertTrue("prodTwo should exist", products.contains(prodTwo));
    // ensure the result ONLY includes the test products
    assertEquals("Only 2 products in result", 2, products.size());
    // nd prodOne − result is generic collection, so we have to sequentially search for it
    for (Product p : products) {
    if (p.equals(prodOne)) {
    // ensure that all of the details were correctly retrieved
    assertEquals(prodOne.getId(), p.getId());
    assertEquals(prodOne.getName(), p.getName());
    assertEquals(prodOne.getDescription(), p.getDescription());
    assertEquals(prodOne.getCategory(), p.getCategory());
    assertEquals(prodOne.getPrice(), p.getPrice());
    assertEquals(prodOne.getQuantity(), p.getQuantity());   
  }
 }
}
    
@Test
    public void testDaoFindById() {
    // get prodOne using findById method
    Product retrieved = dao.findById(1);
    // ensure that you got back prodOne, and not another product
    assertEquals("Retrieved product should be the same as the saved one",prodOne, retrieved);
    // ensure that prodOne's details were properly retrieved
    Collection<Product> products = dao.getProducts();
    for (Product p : products) {
    if (p.equals(prodOne)) {
    assertEquals(prodOne.getId(), p.getId());
    assertEquals(prodOne.getName(), p.getName());
    assertEquals(prodOne.getDescription(), p.getDescription());
    assertEquals(prodOne.getCategory(), p.getCategory());
    assertEquals(prodOne.getPrice(), p.getPrice());
    assertEquals(prodOne.getQuantity(), p.getQuantity());   
  }
    }
    // call findById using a non−existent ID
     retrieved = dao.findById(5);
    // ensure that the result is null
    assertNull("Product doesn't exist", retrieved);
}

@Parameterized.Parameters
public static Collection<?> daoObjectsToTest() {
    return Arrays.asList(new Object[][]{
        {new ProductStore()},
        {new ProductJdbcDAO("jdbc:h2:tcp://localhost:9099/project-testing;IFEXISTS=TRUE")}
});
}
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
