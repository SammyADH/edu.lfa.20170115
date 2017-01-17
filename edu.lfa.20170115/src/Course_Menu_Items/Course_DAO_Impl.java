
package Course_Menu_Items;

import java.util.ArrayList;
import java.util.List;


public class Course_DAO_Impl implements Course_DAO{
private static List<CArraylist> clist = new ArrayList<>();
    @Override
    public void insert(CArraylist c_var) {
        clist.add(c_var);
    }

    @Override
    public List<CArraylist> getAll() {
       return clist;
    }

    @Override
    public void delbyID(int cid) {
        for (CArraylist sal : clist) {
                        if (cid == sal.getId()) {
                            clist.remove(sal);
                            System.out.println("Sucessfilly Deleted");
                        } else {
                            System.out.println("Data not deleted");
                        }
                    }
    }

} 


