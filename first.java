
//  first run with login test
// after this run code with super class 
// open with vs-code editor it will run properly
import java.util.*;
import java.util.Scanner;

class Login {

    Scanner sc;
    String ur, pass;

    public Login(Scanner sc) {
        this.sc = sc;
        insertData();
    }

    public void insertData() {
        System.out.println("enter username:");
        ur = sc.nextLine();

        System.out.println(" enter password:");
        pass = sc.nextLine();
        validation();
    }

    public void validation() {
        if (ur.equals("admin")) {
            if (pass.equals("password")) {
                System.out.println("Successfully login welcome the student information system");
            } else {
                System.out.println("Wrong password please try again");
            }
        } else {
            System.out.println("Wrong username please try again");
        }
    }
}

class Login_Test {
    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in);
        Login login1 = new Login(sc);

    }
    // first run with login test
    // after this run code with super class
}

class Student {
    String branch;
    int roll;
    String firstname;
    String lastname;
    Scanner s;

    public Student(Scanner s) {

        this.s = s;

    }

    public void setData() {
        System.out.println("Welcome the Student Information System");
        System.out.println("enter branch:-");
        branch = s.next();
        System.out.println("enter roll number:-");
        roll = s.nextInt();
        System.out.println("enter firstname:-");
        firstname = s.next();

        System.out.println("enter lastname:-");
        lastname = s.next();
        String concatenatedString = firstname + lastname;

        System.out.println("fullname of student is= " + concatenatedString);

    }

    // showing the student information
    public void display() {
        System.out.println(" Display Student Information");
        System.out.println("branch=" + branch);
        System.out.println("roll=" + roll);
        System.out.println("fullname=" + firstname + lastname);

    }
}

class Marks extends Student {
    int m1, m2, m3, sum;
    Scanner s;

    public Marks(Scanner s) {
        super(s);

        this.s = s;
    }

    public void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three subjects of marks");
        System.out.println("maths:");
        m1 = sc.nextInt();
        // System.out.println("maths=" + m1);
        System.out.println("physics:");
        m2 = sc.nextInt();
        // System.out.println("physics=" + m2);
        System.out.println("chemistry:");
        m3 = sc.nextInt();
        // System.out.println("chemistry=" + m3);
    }

    public void display() {
        super.display();
        System.out.println("result/total marks" + (m1 + m2 + m3));
        System.out.println("percentage is = " + (m1 + m2 + m3) / 3 * 100);

    }

}

class Super {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        Marks obj = new Marks(scr);
        obj.setData();
        obj.marks();
        obj.display();

    }
}