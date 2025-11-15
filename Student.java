public class Student {
    private Integer rollNo;
    private String name;
    private String email;
    private String course;
    private Double marks;

    public Student(Integer rollNo, String name, String email, String course, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public Integer getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public Double getMarks() { return marks; }

    public String getGrade() {
        double m = marks;
        if (m >= 80) return "A+";
        if (m >= 70) return "A";
        if (m >= 60) return "B";
        if (m >= 50) return "C";
        if (m >= 40) return "D";
        return "F";
    }
}
