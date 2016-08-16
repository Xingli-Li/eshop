/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class JUnitTest {
    
    private int result = 10;
    
    public JUnitTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    result =10;}
    
    @After
    public void tearDown() {
    }
    @Test
    public void test01(){
          result += 10;
          assertEquals(20, result);
    }
    @Test
    public void test02(){
          result -= 10;
          assertEquals(0, result);
    }
    
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

