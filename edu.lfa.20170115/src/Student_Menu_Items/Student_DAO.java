package Student_Menu_Items;

import java.util.List;

public interface Student_DAO {

    void insert(SArraylist s_var);

    List<SArraylist> getAll();

    void delbyID(int id);

}
