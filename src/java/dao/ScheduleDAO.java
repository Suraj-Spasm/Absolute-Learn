
package dao;
import java.util.List;
import model.Schedule;


public interface ScheduleDAO {
    public List<Schedule> getAllSchedule();
    public Schedule getLectureByID(int id);
    public boolean addSchedule(Schedule u);
    public boolean deleteSchedule(Schedule u);
    public boolean updateSchedule(Schedule u);
    public int getLastNo();
    
}
