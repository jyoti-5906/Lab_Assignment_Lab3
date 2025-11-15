import java.util.ArrayList;

public class StudentManager implements RecordActions {
    ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s) throws Exception {
        if (s.getMarks() < 0 || s.getMarks() > 100)
            throw new IllegalArgumentException("Invalid Marks");
        list.add(s);
    }

    public void saveStudent(Student s) {
        Thread t = new Thread(new Loader());
        t.start();
        try { t.join(); } catch (Exception e) {}
    }

    public Student findStudent(Integer rollNo) throws StudentNotFoundException {
        for (Student s : list) {
            if (s.getRollNo().equals(rollNo)) return s;
        }
        throw new StudentNotFoundException("Student Not Found");
    }

    public void displayStudent(Integer rollNo) throws Exception {
        Student s = findStudent(rollNo);
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
        System.out.println("Course: " + s.getCourse());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.getGrade());
    }
}
