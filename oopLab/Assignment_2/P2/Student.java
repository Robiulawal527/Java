
public class Student {

    private int studentID;
    private String studentName;
    private double studentCGPA;

    public Student(int studentID, String studentName, double studentCGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCGPA=" + studentCGPA + "]";
    }

    
    
}