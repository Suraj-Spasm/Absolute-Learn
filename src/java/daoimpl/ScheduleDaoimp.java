package daoimpl;


import dao.ScheduleDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Schedule;
        
public class ScheduleDaoimp {
    List<Schedule> sl;
    Schedule u;
    PreparedStatement ps;
    Connection conn;
    
    public ScheduleDaoimp() {
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
    public List<Schedule> getAllSchedule() {
            sl=new ArrayList<>();
            try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SCHEDULE ");
            while (rs.next()) {   
                u = new Schedule();
                u.setLecture_no(rs.getInt(1));
                u.setLecture(rs.getString(2));
                u.setLecture_date(rs.getDate(3));
                u.setStart_time(rs.getTime(4));
                u.setEnd_time(rs.getTime(5));
                u.setDescription(rs.getString(6));
                sl.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error while Fetching Users : "+e.getMessage());
        }
            
        return sl;
    }
     public void disconnect()
    {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Unable to close connection");
        }
    }
     
     
    
    public Schedule getLectureByID(int id) {
        u = new Schedule();
        try {
            ps = conn.prepareStatement("SELECT * FROM Schedule where Lecture_no = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                u.setLecture_no(rs.getInt(1));
                u.setLecture(rs.getString(2));
                u.setLecture_date(rs.getDate(3));
                u.setStart_time(rs.getTime(4));
                u.setEnd_time(rs.getTime(5));
                u.setDescription(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("Error while fetching user by id "+id+" : "+e.getMessage());
        }
        return u;
    }
     
       
    public boolean addSchedule(Schedule u) {
        try {
            ps = conn.prepareStatement("insert into Schedule values (?,?,?,?,?,?)");
            ps.setInt(1, u.getLecture_no());
            ps.setString(2, u.getLecture());
            ps.setDate(3, u.getLecture_date());
            ps.setTime(4, u.getStart_time());
            ps.setTime(5, u.getEnd_time());
            ps.setString(6, u.getDescription());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Added User : "+u.getLecture());
                return true;
            } else {
                System.out.println("Failed User : "+u.getLecture());
                return false;                        
            }
            
        } catch (Exception e) {
            System.out.println("Failed to insert user due to exception : "+e.getMessage());
        }       
        return false;
    }
    
    public boolean deleteSchedule(Schedule u) {
        try {
            ps = conn.prepareStatement("delete from Schedule where Lecture_no =?");
            ps.setInt(1, u.getLecture_no());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Deleted User : "+u.getLecture());
                return true;
            } else {
                System.out.println("Failed to Delete : "+u.getLecture());
                return false;                        
            }
            
         } catch (Exception e) {
            System.out.println("Failed to Delete user due to exception : "+e.getMessage());
        }       
        return false;
    }

    
    public boolean updateSchedule(Schedule u) {
        try {
            ps = conn.prepareStatement("update Schedule set Lecture=?, Lecture_date=?,Start_time=?,End_time=?,Description=? where Lecture_no =?");
            ps.setString(1, u.getLecture());
            ps.setDate(2, u.getLecture_date());
            ps.setTime(3, u.getStart_time());
            ps.setTime(4, u.getEnd_time());
            ps.setString(5, u.getDescription());
            ps.setInt(7, u.getLecture_no());
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Updated User : "+u.getLecture());
                return true;
            } else {
                System.out.println("Failed User : "+u.getLecture());
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
    
    public int getLastNo() {
        int Lecture_no = 0;
        try {
            Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("SELECT max(Lecture_no) FROM Schedule");
            while (rs.next()) {                
                Lecture_no = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching last ID : "+e.getMessage());
        }
        
        return Lecture_no;
    }

}







