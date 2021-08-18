
package dao;

import java.util.List;
import model.Doubt;

public interface DoubtDAO {
    public List<Doubt> getAllDoubts();
    public Doubt getDoubtByNo(int id);
    public boolean addDoubt(Doubt u);
    public boolean deleteDoubt(Doubt u);
    public boolean updateDoubt(Doubt u);
    public int getLastNo();

    
}
