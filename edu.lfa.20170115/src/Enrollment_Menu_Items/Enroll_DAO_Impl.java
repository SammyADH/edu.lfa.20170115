package Enrollment_Menu_Items;

import Course_Menu_Items.CArraylist;
import Student_Menu_Items.SArraylist;
import Student_Menu_Items.Student_DAO;
import Student_Menu_Items.Student_DAO_Impl;
import java.util.ArrayList;
import java.util.List;


public class Enroll_DAO_Impl implements Enroll_DAO {

    SArraylist s_var = new SArraylist();
    CArraylist c_var = new CArraylist();
    Student_DAO var = new Student_DAO_Impl();
    List<SArraylist> chklist = new ArrayList<>();
    
    @Override
    public void check(int a, int b) {
        System.out.println(chklist);
        chklist=var.getAll();
        System.out.println(chklist);
        while (chklist.isEmpty() == false) {
            if (s_var.getId() == a) {
                if (c_var.getId() ==b){
                    System.out.println("Student is enrolled");
                }
            }
        }System.out.println("Record not found");
    }

    @Override
    public void course(int a) {
        while (chklist.isEmpty() == false) {
            if (s_var.getId() == a) {
                System.out.println(s_var.getClist());
            }
        }
    }

    @Override
    public void student(int a) {
        while (chklist.isEmpty() == false) {
            if (c_var.getId() == a) {
                System.out.println(s_var.toString());
            }
        }
    }

}
