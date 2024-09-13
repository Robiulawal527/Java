import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseTitle;
    private double courseCredit;


    private ArrayList<Student> studentList = new ArrayList<>();
    private int numberOfStudents;
    private Faculty faculty;


    public Course(String courseID, String courseTitle, double courseCredit) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
    }


    public String getCourseID() {
        return courseID;
    }


    public String getCourseTitle() {
        return courseTitle;
    }


    public double getCourseCredit() {
        return courseCredit;
    }


    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }


    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    


    





}
