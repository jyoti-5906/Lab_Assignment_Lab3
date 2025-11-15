public interface RecordActions {
    void addStudent(Student s) throws Exception;
    void saveStudent(Student s);
    Student findStudent(Integer rollNo) throws StudentNotFoundException;
    void displayStudent(Integer rollNo) throws Exception;
}
