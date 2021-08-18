
package daoimpl;
import dao.DoubtDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doubt;

public class DoubtDaoimp {
    List<Doubt> Dl;
    Doubt u;
    PreparedStatement ps;
    Connection conn;
    public DoubtDaoimp() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/User","root","root");
            System.out.println("Connected !!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error while connecting !!! \nDriver not Found : "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error While Connecting !!! \nDatabase issue : "+ex.getMessage());
        }
    }
    
    
    public List<Doubt> getAllDoubts() {
        Dl = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Doubts");
            while (rs.next()) {   
                u = new Doubt();
                u.setDoubt_no(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setSubject(rs.getString(4));
                u.setDoubt(rs.getString(5));
                Dl.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error while Fetching Doubts : "+e.getMessage());
        }
        
        return Dl;
    }
    public void disconnect()
    {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Unable to close connection");
        }
    }
    
    
    
    
    public boolean addDoubt(Doubt u) {
        try {
            ps = conn.prepareStatement("insert INTO DOUBTS VALUES (?,?,?,?,?,)");
            ps.setInt(1, u.getDoubt_no());
            ps.setString(2, u.getName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getSubject());
            ps.setString(5, u.getDoubt());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Added Doubt Of : "+u.getName());
                return true;
            } else {
                System.out.println("Failed Doubt Of  : "+u.getName());
                return false;                        
            }
            
        } catch (Exception e) {
            System.out.println("Failed to insert user due to exception : "+e.getMessage());
        }       
        return false;
    }

    
    public boolean deleteDoubt(Doubt u) {
        try {
            ps = conn.prepareStatement("delete from Doubts where Doubt_no =?");
            ps.setInt(1, u.getDoubt_no());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Deleted Doubt Of : "+u.getName());
                return true;
            } else {
                System.out.println("Failed to Delete Doubt Of : "+u.getName());
                return false;                        
            }
            
         } catch (Exception e) {
            System.out.println("Failed to Delete user due to exception : "+e.getMessage());
        }       
        return false;
    }

    
    public boolean updateDoubt(Doubt u) {
        try {
            ps = conn.prepareStatement("update Doubts set Name=?, Email=?,Subject=?,Doubt=? where Doubt_no =?");
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSubject());
            ps.setString(4, u.getDoubt());
            ps.setInt(7, u.getDoubt_no());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Updated Doubt Of  : "+u.getName());
                return true;
            } else {
                System.out.println("Failed Doubt Of : "+u.getName());
                return false;                        
            }
            
        } catch (SQLException e) {
            System.out.println("Failed to update Doubt due to exception : "+e.getMessage());
        }       
        return false;
    }

    /**
     *
     * @return
     */
  
    public int getLastno() {
        int Doubts_no = 0;
        try {
            Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("SELECT max(Doubts_no) FROM Doubts");
            while (rs.next()) {                
                Doubts_no = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching last ID : "+e.getMessage());
        }
        
        return Doubts_no ;
    }
}
