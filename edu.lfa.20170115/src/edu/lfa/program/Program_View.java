package edu.lfa.program;

import Enrollment_Menu_Items.Enroll;
import Student_Menu_Items.Student;
import java.util.Scanner;

public class Program_View {

    static Scanner input = new Scanner(System.in);
    static Student s_var = new Student();
    static Enroll e_var = new Enroll();
    public void controller() {
        System.out.println("Menu");
        System.out.println("1. Student Admission");
        System.out.println("2. Enrollment Status");
        System.out.println("3. Exit");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                s_var.s_main();
                break;
            case 2:
                e_var.e_main();
                break;
            case 3:
                System.exit(0);
            default:
                System.exit(0);
        }

    }
}
