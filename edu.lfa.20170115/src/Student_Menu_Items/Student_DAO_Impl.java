
package Student_Menu_Items;

import Course_Menu_Items.Course_View;
import java.util.ArrayList;
import java.util.List;

public class Student_DAO_Impl implements Student_DAO {
public List<SArraylist> slist = new ArrayList<>();
private Course_Menu_Items.Course_View c_var = new Course_View();
    @Override
    public void insert(SArraylist s_var) {
        slist.add(s_var);
        c_var.controller();
    }

    @Override
    public List<SArraylist> getAll() {
        return slist;
    }

    @Override
    public void delbyID(int sid) {
        for (SArraylist sal : slist) {
                        if (sid == sal.getId()) {
                            slist.remove(sal);
                            System.out.println("Sucessfilly Deleted");
                        } else {
                            System.out.println("Data not deleted");
                        }
                    }
    }
    
    
}
