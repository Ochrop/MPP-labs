package lab2.prob2A;

public class Student {
    private String name;
    private GradeReport report;

    public Student (String name) {
        this.name = name;
        report = new GradeReport(this, "O");
    }
    public String getName() {
        return name;
    }
    public GradeReport getGradeReport() {
        return report;
    }
    public void printGrade() {
        System.out.println("Student: " + report.getStudent().getName() + ", Grade: " + report.getGrade());
    }
}
