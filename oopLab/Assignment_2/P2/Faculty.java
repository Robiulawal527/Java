public class Faculty {
    private int facultyID;
    private String facultyName;
    private String facultyPosition;

    public Faculty(int facultyID, String facultyName, String facultyPosition) {
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }


    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty [facultyID=" + facultyID + ", facultyName=" + facultyName + ", facultyPosition="
                + facultyPosition + "]";
    }

    
    
}
