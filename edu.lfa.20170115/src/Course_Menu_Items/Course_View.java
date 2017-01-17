
package Course_Menu_Items;

import edu.lfa.program.Program_View;
import java.util.Scanner;


public class Course_View {
    private Scanner input = new Scanner(System.in);
    private Course_DAO c_var = new Course_DAO_Impl();
    private Program_View p_var = new Program_View();
    public void add(){
        CArraylist ca = new CArraylist();
                    System.out.println("Enter Course id");
                    ca.setId(input.nextInt());
                    System.out.println("Enter course name");
                    ca.setCourse_name(input.next());
                    System.out.println("Enter Price");
                    ca.setPrice(input.next());
                    System.out.println("Enter Duration of course");
                    ca.setDuration(input.nextInt());
                    System.out.println("Enter Duration type");
                    ca.setDuration_type(input.next());
                    c_var.insert(ca);
    }
    public void show(){
        for (CArraylist cal : c_var.getAll()) {
                        System.out.println(cal.toString());
                    }
    }
    public void del(){
        System.out.println("Enter student id");
                    int cid = input.nextInt();
                    c_var.delbyID(cid);
    }
    public void controller(){
      while (true) {
            System.out.println("About Course:");
            System.out.println("1.Add ");
            System.out.println("2.Show all");
            System.out.println("3.Delete");

            System.out.println("Enter your choice [1-3]");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    del();
                    
                    break;

                default:
                    p_var.controller();
                    break;
            }
        }
    }  
   }

