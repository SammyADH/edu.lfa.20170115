package Enrollment_Menu_Items;

import edu.lfa.program.Program_View;
import java.util.Scanner;

public class Enroll_View {

    Scanner input = new Scanner(System.in);
    Enroll_DAO e_var = new Enroll_DAO_Impl();
    private Program_View p_var = new Program_View();

    public void controller() {
        System.out.println("About Enrollment");
        System.out.println("1. Enrollment status");
        System.out.println("2. List courses by Student");
        System.out.println("3. List students by Course");
        System.out.println("4. Exit");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                abc();
                break;
            case 2:
                def();
                break;
            case 3:
                ghi();
                break;
            default:
                p_var.controller();
                break;

        }
    }

    public void abc() {
        System.out.println("Enter Student ID : ");
        int stdId = input.nextInt();
        System.out.println("Enter Course ID : ");
        int crsId = input.nextInt();
        e_var.check(stdId, crsId);
    }

    public void def() {
        System.out.println("Enter Student ID : ");
        int stdId = input.nextInt();
        e_var.student(stdId);
    }

    public void ghi() {
        System.out.println("Enter Course ID : ");
        int crsId = input.nextInt();
        e_var.student(crsId);
    }
}
