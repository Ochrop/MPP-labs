package lab2.prob2A;

public class GradeReport {
    private String grade;
    private Student student;
    GradeReport(Student std, String grade) {
        student = std;
        this.grade = grade;
    }
    public Student getStudent(){
        return student;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
}
