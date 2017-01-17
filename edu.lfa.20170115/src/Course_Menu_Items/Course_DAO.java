/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course_Menu_Items;


import java.util.List;

/**
 *
 * @author samya
 */
public interface Course_DAO {
    
    void insert(CArraylist c_var);

    List<CArraylist> getAll();

    void delbyID(int id);
}
