package Student_Menu_Items;

import edu.lfa.program.Program_View;
import java.util.Scanner;

public class Student_View {

    private Scanner input = new Scanner(System.in);
    private Student_DAO s_DAO = new Student_DAO_Impl();
    private Program_View p_var = new Program_View();

    public void add() {
        SArraylist sa = new SArraylist();
        System.out.println("Enter Student id");
        sa.setId(input.nextInt());
        System.out.println("Enter Student Fname");
        sa.setFname(input.next());
        System.out.println("Enter Student Lname");
        sa.setLname(input.next());
        System.out.println("Enter Student email");
        sa.setEmail(input.next());
        s_DAO.insert(sa);
    }

    public void show() {
        for (SArraylist s_var : s_DAO.getAll()) {
            System.out.println(s_var.toString());
        }
    }

    public void del() {
        System.out.println("Enter student id");
        int sid = input.nextInt();
        s_DAO.delbyID(sid);
    }

    public void controller() {
        while (true) {
            System.out.println("About Student:");
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
