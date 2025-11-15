import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager m = new StudentManager();

        try {
            System.out.print("Enter Roll No (Integer): ");
            Integer roll = Integer.valueOf(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            Double marks = Double.valueOf(sc.nextLine());

            Student s = new Student(roll, name, email, course, marks);

            Thread t = new Thread(new Loader());
            t.start();
            t.join();

            m.addStudent(s);
            m.saveStudent(s);
            m.displayStudent(roll);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
