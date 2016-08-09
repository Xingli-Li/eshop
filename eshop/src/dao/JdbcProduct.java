/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author lixi3350
 */
public class JdbcProduct {
    String url = "jdbc:h2:tcp://localhost:9088/project;IFEXISTS=TRUE";

    public JdbcProduct() {
    }
    
    public JdbcProduct(String url){
     this.url=url;
    }
    
    
}
