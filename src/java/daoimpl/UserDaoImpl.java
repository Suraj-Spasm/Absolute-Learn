
package daoimpl;

import dao.UserDAO;
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
import model.User;

public class UserDaoImpl implements UserDAO{

    List<User> ul;
    User u;
    PreparedStatement ps;
    Connection conn;
    public UserDaoImpl() {
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
 
    @Override
    public List<User> getAllUsers() {
        ul = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USERS ");
            while (rs.next()) {   
                u = new User();
                u.setUser_id(rs.getInt(1));
                u.setUser_name(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setContact(rs.getString(5));
                u.setRole(rs.getString(6));
                u.setActive(rs.getBoolean(7));
                ul.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error while Fetching Users : "+e.getMessage());
        }
        
        return ul;
    }

    public void disconnect()
    {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Unable to close connection");
        }
    }
    
    
    
    @Override
    public List<User> getAllActiveUsers() {
       ul = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USERS where active = true");
            while (rs.next()) {   
                u = new User();
                u.setUser_id(rs.getInt(1));
                u.setUser_name(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setContact(rs.getString(5));
                u.setRole(rs.getString(6));
                u.setActive(rs.getBoolean(7));
                ul.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error while Fetching USers : "+e.getMessage());
        }        
        return ul; 
    }

    @Override
    public List<User> getAllDisabledUsers() {
        ul = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USERS where active = false");
            while (rs.next()) {   
                u = new User();
                u.setUser_id(rs.getInt(1));
                u.setUser_name(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setContact(rs.getString(5));
                u.setRole(rs.getString(6));
                u.setActive(rs.getBoolean(7));
                ul.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error while Fetching USers : "+e.getMessage());
        }        
        return ul; 
    }
     @Override
     public User getUserByID(int id) {
        u = new User();
        try {
            ps = conn.prepareStatement("SELECT * FROM Users where User_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                u.setUser_id(rs.getInt(1));
                u.setUser_name(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setContact(rs.getString(5));
                u.setRole(rs.getString(6));
                u.setActive(rs.getBoolean(7));
            }
        } catch (Exception e) {
            System.out.println("Error while fetching User by id "+id+" : "+e.getMessage());
        }
        return u;
    }

    @Override
      public User getUSerByEmail(String email) {
        u = new User();
        try {
            ps = conn.prepareStatement("SELECT * FROM USERS where email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                u.setUser_id(rs.getInt(1));
                u.setUser_name(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setContact(rs.getString(5));
                u.setRole(rs.getString(6));
                u.setActive(rs.getBoolean(7));
            }
        } catch (Exception e) {
            System.out.println("Error while fetching user by email "+email+" : "+e.getMessage());
        }
        return u;
    }

    @Override
    public boolean addUser(User u) {
        try {
            ps = conn.prepareStatement("insert into users values (?,?,?,?,?,?,?)");
            ps.setInt(1, u.getUser_id());
            ps.setString(2, u.getUser_name());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getContact());
            ps.setString(6, u.getRole());
            ps.setBoolean(7,u.isActive());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Added User : "+u.getUser_name());
                return true;
            } else {
                System.out.println("Failed User : "+u.getUser_name());
                return false;                        
            }
            
        } catch (Exception e) {
            System.out.println("Failed to insert user due to exception : "+e.getMessage());
        }       
        return false;
    }

    @Override
    public boolean deleteUser(User u) {
        try {
            ps = conn.prepareStatement("delete from users where id =?");
            ps.setInt(1, u.getUser_id());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Deleted User : "+u.getUser_name());
                return true;
            } else {
                System.out.println("Failed to Delete : "+u.getUser_name());
                return false;                        
            }
            
         } catch (Exception e) {
            System.out.println("Failed to Delete user due to exception : "+e.getMessage());
        }       
        return false;
    }

    @Override
    public boolean updateUser(User u) {
        try {
            ps = conn.prepareStatement("update users set User_name=?, email=?,password=?,contact=?,role=?, active=? where User_id =?");
            ps.setString(1, u.getUser_name());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getContact());
            ps.setString(5, u.getRole());
            ps.setBoolean(6,u.isActive());
            ps.setInt(7, u.getUser_id());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Updated User : "+u.getUser_name());
                return true;
            } else {
                System.out.println("Failed User : "+u.getUser_name());
                return false;                        
            }
            
        } catch (SQLException e) {
            System.out.println("Failed to update user due to exception : "+e.getMessage());
        }       
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public int getLastID() {
        int User_id = 0;
        try {
            Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("SELECT max(User_ID) FROM USERS");
            while (rs.next()) {                
                User_id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching last ID : "+e.getMessage());
        }
        
        return User_id;
    }
}
