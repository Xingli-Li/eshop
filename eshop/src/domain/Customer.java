/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author lixi3350
 */
public class Customer {
    private String userName;
    private String name;
    private Integer creditcard;
    private Integer password;
    //private Order order;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditcard(Integer creditcard) {
        this.creditcard = creditcard;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public Integer getCreditcard() {
        return creditcard;
    }

    public Integer getPassword() {
        return password;
    }
    
    
}
