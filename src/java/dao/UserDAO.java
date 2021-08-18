
package dao;

import java.util.List;
import model.User;

public interface UserDAO {
    public List<User> getAllUsers();
    public List<User> getAllActiveUsers();
    public List<User> getAllDisabledUsers();
    public User getUserByID(int id);
    public User getUSerByEmail(String email);
    public boolean addUser(User u);
    public boolean deleteUser(User u);
    public boolean updateUser(User u);
    public int getLastID();
}
