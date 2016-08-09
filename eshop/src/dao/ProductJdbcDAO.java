/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author lixi3350
 */
public class ProductJdbcDAO implements ProductDAO{
    String url = "jdbc:h2:tcp://localhost:9088/project;IFEXISTS=TRUE";

    public ProductJdbcDAO() {
    }
    
    public ProductJdbcDAO(String url){
     this.url=url;
    }

    @Override
    public Collection<Product> getProducts() {
        String sql = "select * from products order by id";
        try (
            // get a connection to the database
            Connection dbCon = JdbcConnection.getConnection(url);
            // create the statement
            PreparedStatement stmt = dbCon.prepareStatement(sql);
            ) {
                // execute the query
                ResultSet rs = stmt.executeQuery();
                // Create a collection for holding the product we get from the query.
                // We are using a List in order to preserve the order in which
                // the data was returned from the query.
                Collection<Product> products = new ArrayList<>();
                // iterate through the query results
                while (rs.next()) {
                // get the data out of the query
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String category = rs.getString("category");
                Integer price = rs.getInt("price");
                Integer quantity = rs.getInt("quantity");
                // use the data to create a student object
                 Product p = new Product(id, name, description, category, price, quantity);
                // and put it in the collection
                products.add(p);
                }
              return products;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
    }
}

    @Override
    public Collection<String> getCategories() {
         try ( 
                // get a connection to the database
                Connection connection = JdbcConnection.getConnection(url);
                // To retrieve a unique sorted list of category in descending order:
                PreparedStatement stmt
                = connection.prepareStatement("select distinct category from productss order by category desc");
                // execute the query
                ResultSet rs = stmt.executeQuery();) {
   
                Collection<String> categories = new ArrayList<>();
                // iterate through the query results
                while (rs.next()) {
                    // get the data out of the query
                    String category = rs.getString("category");
                    // and put it in the collection
                    categories.add(category);
            }
                return categories;
            } catch (SQLException ex) {
                 throw new RuntimeException(ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Product product) {
         String sql = "insert into product(id,name,description,category,price,quantity)values(?,?,?,?,?,?)";
         try (
        // get connection to database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
        ) {
            stmt.setInt(1, product.getProductID());
            stmt.setString(2, product.getProductName());
            stmt.setString(3, product.getDescription());
            stmt.setString(4, product.getCategory());
            stmt.setInt(5, product.getPrice());
            stmt.setInt(6, product.getQuantity());
            // execute the statement
            stmt.executeUpdate();
                
            } catch (SQLException ex) { // we are forced to catch SQLException
            // don't let the SQLException leak from our DAO encapsulation
            throw new RuntimeException(ex);
            }

    }

    @Override
    public void delete(Product selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Product> findByFilter(String category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
