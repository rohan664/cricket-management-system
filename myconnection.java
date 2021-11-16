import java.sql.*;
import javax.swing.*;

/**
 *
 * @author rohit desai
 */
public class myconnection {
    Connection conn=null;
    public static Connection ConnectDB() {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/login","root","rohandesai664");
          
           return conn;
           
                   
       }
     catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
  }
  
    }
}

            
            
            
            
            
            
            
            
            
      
    

