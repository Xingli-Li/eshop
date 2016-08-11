
import dao.ProductDAO;
import dao.ProductJdbcDAO;
import gui.Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lixi3350
 */
public class Main {

    private static ProductDAO dao = new ProductJdbcDAO();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Menu frame = new Menu(dao); 
        // centre the frame on the screen
        frame.setLocationRelativeTo(null);
        // show the frame
        frame.setVisible(true);

// TODO code application logic here
    }
    
}
    
